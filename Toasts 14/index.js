import express from 'express';
import mysql from 'mysql';

const app = express();


const dbConnection = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'F4natysm36',
    database:'practice'
});

dbConnection.connect((err, result) => {
    if (err) {
        throw err;
    }

    console.log('DB Connection OK!');
});

process.on('uncaughtException', (err) => {
    console.log('Fatal error occured');
    process.exit(1);
});

dbConnection.query('SHOW TABLES', (err, results, fields) => {
    console.log(results);
});

app.listen(3000, () => {
    console.log('Listening on port 3000');
});

app.use(express.static('public'));
app.use(express.json()); //body parser for post endpoint

app.get('/student', (req, res) => {
    dbConnection.query('SELECT * FROM persons', (err, results) => {
        res.json(results);
    });
});

app.post('/student', (req, res) => {

    const person = req.body;

    dbConnection.query('INSERT INTO persons SET ?', person, (err, results) => {
        
        if(err) {
            res.status(500).json({
                error: err.message
            });
            return;
        }
        
        console.log(person);

    });

});

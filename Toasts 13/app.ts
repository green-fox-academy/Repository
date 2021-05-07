import { json } from 'body-parser';
import * as express from 'express';
import * as fs from 'fs';

const app: any = express();
const port: number = 3000;

app.listen(port, () => {
    console.log(`Listens on ${port}`);
});

app.use(express.json());

app.use('/static', express.static('public'));

app.get('/', (req, res) => {
    res.send('Im still alive');
});

app.get('/status', (req, res) => {

    const queryParams: { [k: string]: string}= req.query;
    const { code }: {code ?: string } = queryParams;

    let statusCode: number = 200;

    if (code !== undefined) {
        statusCode = parseInt(code);
    }

    res.status(statusCode).send('Custom status code');
});

app.get('/url-param/undefined', (req, res) => {
    res.send(`<h1> Hello Someone!</h1>`);
});

app.get('/url-param/:name', (req, res) => {
    const params: { [k: string]: string } = req.params;
    const { name }: {name?: string } = params;
    console.log(req.params);

    res.send(`<h1> Hello ${name}!</h1>`);
});

app.post('/student', (req, res) => {
    try {
        fs.writeFileSync('student.json', JSON.stringify(req.body));
        res.status(200).send();
    } catch (err) {
        res.status(500).send();
    }
});

app.get('/student', (req, res) => {
    try {
        const student: JSON = JSON.parse(fs.readFileSync('student.JSON', 'utf-8'));
        res.status(200).send(student);
    } catch (err) {
        res.status(500).send(err.message);
    }
});

function sumOfArray(arrayOfNumbers: number[]): number {
    let result: number= 0;
    for (let i: number = 0; i < arrayOfNumbers.length; i++) {
        result += arrayOfNumbers[i];
    }
    return result;
};

app.post('/arrays', (req, res) => {
    const sumResult: string = sumOfArray(req.body.numbers).toString();

    if (req.body.what === 'sum') {
        res.status(200).send(sumResult);
    } else {
        res.status(500).send('error: Please provide what to do with numbers');
    }
});


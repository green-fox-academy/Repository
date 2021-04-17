//https://nodejs.org/api/fs.html
import { fstat } from "node:fs";
import * as fs from 'fs';

const exceptionsTSSync = fs.readFileSync('exceptions.ts', 'utf8');
console.log(exceptionsTSSync);

const exceptionsTSAsync = fs.readFile('package-lock.json', 'utf8', (err, data) => {
    if (err) return console.log(err.message);
    console.log(data);
})

fs.writeFileSync('newFileIO.ts', 'console.log("Hello")');

fs.appendFileSync('newFileIO.ts', '\n\nconsole.log("Hello Again")');

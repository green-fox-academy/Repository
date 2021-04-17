var height = '183 cm';

console.log('Markovics Roland');
console.log(27);
console.log(height);

var roland = {
    name: 'Roland',
    age: '27',
    heightProperty: '183 cm'
}

console.log(roland.name, roland.age, roland.heightProperty);

console.log(22 + 13);

console.log(22 % 13); //maradék

let currentHours: number = 16;
let currentMinutes: number = 6;
let currentSeconds: number = 42;

const maxHours: number = 24;
const maxMinutes: number = 60;
const maxSeconds: number = 60;

let remainingHours: number = maxHours - currentHours;
let remainingMinutes: number = maxMinutes - currentMinutes;
let remainingSeconds: number = maxSeconds - currentSeconds;

let currentTimeInSeconds: number = (currentHours * maxMinutes * maxSeconds) + (currentMinutes * maxSeconds) + currentSeconds;

let remainingTimeInSeconds: number = (remainingHours * maxMinutes * maxSeconds) + (remainingMinutes * maxSeconds) + remainingSeconds;

console.log(remainingTimeInSeconds);
console.log(currentTimeInSeconds);


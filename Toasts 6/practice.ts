let a: number = 1;
let b: number = 3;
const numArr: number[] = [1, 2, 3, 4, 5];

function addTwoNumbers(number1: number, number2: number): number {
    return number1 + number2
}

console.log(addTwoNumbers(a, b));

for (let i: number = 0; i < numArr.length; i++) {
    if (numArr[i] === addTwoNumbers(1, 3)){
        console.log('Megvan az Arrayben. A szám: ', numArr[i])
    }
}
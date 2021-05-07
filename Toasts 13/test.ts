function sumOfArray(arrayOfNumbers: number[]): number {
    let result: number= 0;
    for (let i: number = 0; i < arrayOfNumbers.length; i++) {
        result += arrayOfNumbers[i];
    }
    return result;
};

const numbers: number[] = [1, 2, 3];

console.log(sumOfArray(numbers));
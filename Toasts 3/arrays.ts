let animals: string[]= [];
animals.push ('Lion', 'Wolf', 'Bear');

for (let i: number = 0; i < animals.length; i++){
    console.log(animals[i]);
}

for (let animal of animals){
    console.log(animal);
}

let numbers: number[] = [2, 5, 13, 7, 1, 25, -3, 18, -11];

for(let i: number = 0; i < numbers.length; i++){
    for(let j: number = 0; j < numbers.length; j++){
        if (numbers[i] < numbers[j]){
        let temp: number= numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        }
    }
}

for (let number of numbers){
    console.log(number);
}

const matrix: number[][] = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15]
];

for (let i: number= 0; i < matrix.length; i++){
    for (let j: number= 0; j < 5; j++){
        console.log(matrix[i][j]);
    }
}

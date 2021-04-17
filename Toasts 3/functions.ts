console.log('Hello');

function add(a:number, b:number) {
    return ( a + b );
}

console.log(add(2, 3));

const divideTwoNumbers = (numberOne: number, numberTwo: number) => {
    console.log( numberOne / numberTwo );
};

divideTwoNumbers(10, 5);

const fruits: string [] = ['Alma', 'Szilva', 'Narancs']

function logElem(elem: string) {
    console.log( elem );
}

function logEatElem(elem: string) {
    console.log( 'I Eat ', elem)
}

function logHelloElem (elem: string) {
    console.log( 'Hello ', elem)
}

function forEach (logFunction: Function) {
    for(let i:number = 0; i < fruits.length; i++){
        logFunction(fruits[i]);
    }
}

forEach(logElem);
forEach(logEatElem);
forEach(logHelloElem);
forEach( (elem: string) => console.log('Juhu ', elem));
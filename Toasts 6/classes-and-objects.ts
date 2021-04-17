interface CanWalk {
    walk(): void;
}

interface CanRun {
    run(): void;
}

class Person implements CanWalk, CanRun{
    age: number;
    name: string;
    private hunger: number;
    static numberOfPeople: number = 0;

    constructor(age: number, name: string){
        this.age = age;
        this.name = name;
        this.hunger = 0;
        Person.numberOfPeople++;
        console.log('Born');
    }

    walk(): void {
        console.log('Sétálok, mert ${ this.age } éves vagyok');
        this.hunger++;
    }

    run(): void {
        console.log('futok');
    }

    eat(): void{
        this.hunger = 0;
    }

    getHunger(): number{
        return this.hunger;
    }
}

const béla = new Person(20, 'Béla');
const ödön = new Person(12, 'Ödon');

console.log(béla);
console.log(ödön);
béla.walk();
béla.walk();
console.log('Ennyire vagyok éhes: ', béla.getHunger());
béla.eat();
console.log('Ennyire vagyok éhes: ', béla.getHunger());
console.log(Person.numberOfPeople);
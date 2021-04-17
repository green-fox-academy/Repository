//Super

class Person {

    public firstName: string;
    public lastName: string;

    constructor (firstName: string, lastName: string) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getFullName(): string {
        return 'Az én nevem ' + this. firstName + ' ' + this.lastName + '.';
    }

    setFirstName(firstName: string): void {
        this.firstName = firstName;
    }
}

class Student extends Person {
    public courses: string[];

    constructor (firstName: string, lastName: string) {
        super(firstName, lastName);
        this.courses = [];
    }

    addCourse(course: string): void {
        this.courses.push(course);
    }

    getCourses(): string {
        return this.courses.join('; ');
    }
}

class Mentor extends Person {

    public studentCount: number;
    
    constructor (firstName: string, lastName: string, studentCount: number) {
        super(firstName, lastName);
        this.studentCount = studentCount;
    }

    getStudentCount(): number {
        return this.studentCount;
    }

    getFullName(): string {
        return super.getFullName() + '\nA diákjaim száma: ' + this.getStudentCount();
    }
}

const people: Person[] = [
    new Student ('Timi', 'Nagy'),
    new Mentor ('Feri', 'Kiss', 11),
    new Mentor ('Viki', 'Kocsis', 30),
    new Student ('Peti', 'Bárdos')
]

function listPeopleFullName (people: Person[]) {
    for (let i: number = 0; i < people.length; i++) {
        console.log(people[i].getFullName())
    }
}

const bela = new Student('Bela', 'Kovacs');
const jani = new Mentor('Jani', 'Tóth', 20);
bela.addCourse('TypeScript');
bela.addCourse('SoftSkill');

console.log(bela.getFullName());
console.log(bela.getCourses());
console.log(jani.getFullName());


jani.setFirstName('János');
console.log(jani.getFullName());

listPeopleFullName(people);


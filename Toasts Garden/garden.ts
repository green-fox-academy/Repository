class Plant {

    private color: string;
    protected waterLevel: number;
    protected waterMultiplier: number;

    constructor (color: string) {
        this.color = color;
        this.waterLevel = 0;
        this.waterMultiplier = 0;
    }

    getColor(): string{
        return this.color;
    }

    doesItNeedWater():string{
        if (this.waterLevel < 1) {
            return ' needs water!';
        } else {
            return " doesn't need water"; 
        }
    }

    water(waterAmount: number): void {
        this.waterLevel += Math.round(waterAmount * this.waterMultiplier);
    }
}

class Flower extends Plant {

    constructor (color: string) {
        super(color);
        this.waterMultiplier = 0.75;
    }

    doesItNeedWater(): string{
        if (this.waterLevel < 5) {
            return ' needs water!';
        } else {
            return " doesn't need water"; 
        }
    }
}

class Tree extends Plant{


    constructor (color: string) {
        super(color);
        this.waterMultiplier = 0.40;
    }

    doesItNeedWater(): string{
        if (this.waterLevel < 10) {
            return ' needs water!';
        } else {
            return " doesn't need water"; 
        }
    }

}

class Garden {

    private garden: Plant[];

    constructor (){
        this.garden = [];
    }

    addFlower(color: string): void {
        let flower = new Flower(color);
        this.garden.push(flower)
    }

    addTree(color: string): void {
        let tree = new Tree(color);
        this.garden.push(tree)
    }

    showGarden(): void {
        for (let i: number = 0; i < this.garden.length; i++) {
            if (this.garden[i] instanceof Flower){
            console.log('This ' + this.garden [i].getColor() + ' Flower' + this.garden [i].doesItNeedWater());
            } else {
            console.log('This ' + this.garden [i].getColor() + ' Tree' + this.garden [i].doesItNeedWater());
            }
        }
    }

    waterGarden(waterAmount: number): void {

        let gardenSize = this.garden.length;
        let waterPerPlant = Math.round(waterAmount / gardenSize);

        for (let i: number = 0; i < this.garden.length; i++) {
            this.garden[i].water(waterPerPlant);
        }
    }
}

const garden = new Garden();
garden.addFlower('Yellow');
garden.addFlower('Blue');
garden.addTree('Purple');
garden.addTree('Orange');

garden.showGarden();

garden.waterGarden(40);

garden.showGarden();

garden.waterGarden(70);

garden.showGarden();
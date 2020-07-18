package garden;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Garden garden = new Garden();

    garden.addPlant(new Flower("Yellow"));
    garden.addPlant(new Flower("Blue"));
    garden.addPlant(new Tree("Purple"));
    garden.addPlant(new Tree("Orange"));

    garden.getGardenStatus();

    garden.water(40);

    System.out.println();
    garden.getGardenStatus();

    garden.water(70);

    System.out.println();
    garden.getGardenStatus();
  }
}

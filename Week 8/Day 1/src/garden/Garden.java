package garden;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void addPlant(Plant plant){
    garden.add(plant);
  }
}

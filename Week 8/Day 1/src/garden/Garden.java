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

  public void getGardenStatus(){
    for (Plant p : garden) {
      p.getPlantStatus();
    }
  }

  public void water (int waterAmount) {
    for (Plant p : garden) {
      if (p.needsWater()) {
        p.waterPlants(waterAmount / p.counter());
      }
    }
  }
}

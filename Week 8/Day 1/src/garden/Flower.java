package garden;

public class Flower extends Plant {
  public Flower(String name) {
    super(name);
  }

  @Override
  public void getPlantStatus() {
    if (needsWater()) {
      System.out.println("The " + name + " Flower needs water!");
    } else {
      System.out.println("The " + name + " Flower does not need water!");
    }
  }
}

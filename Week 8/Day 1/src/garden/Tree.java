package garden;

public class Tree extends Plant{

  public Tree (String name){
    super (name);
  }

  @Override
  public boolean needsWater() {
    return waterLevel < 10;
  }

  @Override
  public void getPlantStatus() {
    if (needsWater()) {
      System.out.println("The " + name + " Tree needs water!");
    } else {
      System.out.println("The " + name + " Tree does not need water!");
    }
  }
}

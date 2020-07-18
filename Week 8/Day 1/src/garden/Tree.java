package garden;

public class Tree extends Plant{

  public Tree (String name){
    super (name);
  }

  @Override
  public boolean needsWater() {
    return waterLevel < 10;
  }
}

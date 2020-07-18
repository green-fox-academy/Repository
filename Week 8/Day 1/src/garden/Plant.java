package garden;

public class Plant {
  private String name;

  public Plant(String name){
    this.name = name;
  }

  public void getPlantStatus() {
    System.out.println(name);
  }
}

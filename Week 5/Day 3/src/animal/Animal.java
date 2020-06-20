package animal;

public class Animal {
  private int hunger = 50;
  private int thirst = 50;

  public Animal() {
  }

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  public void printStatus(){
    System.out.println(hunger + "\n" + thirst + "\n");
  }
}

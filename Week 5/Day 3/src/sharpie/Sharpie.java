package sharpie;

public class Sharpie {
  private String color;
  private float width;
  private float inkAmount = 100;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = convertToFloat(width);
  }

  private float convertToFloat (double width) {
    return (float) width;
  }

  public void use() {
  inkAmount -= 3.2;
  }

  public void printStatus () {
    System.out.println(color + "\n" + width + "\n" + inkAmount + "\n");
  }
}

/*Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount
*/

package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie red = new Sharpie ("Red", 0.5);
    Sharpie blue = new Sharpie ("Blue", 0.7);
    red.printStatus();
    blue.printStatus();
    red.use();
    red.use();
    blue.use();
    red.printStatus();
    blue.printStatus();
  }
}

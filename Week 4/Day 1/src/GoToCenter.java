import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Draw at least 3 lines with that function using a loop.

    for (int i = 0; i < 5; i++) {
      drawLine(graphics, randomStart(), randomStart());
    }
  }

  public static int randomStart() {
    Random random = new Random();
    int max = (321);
    return random.nextInt(max);
  }

  public static void drawLine (Graphics graphics, int x, int y) {
    Random random = new Random();
    int horizontalMiddle = (WIDTH / 2);
    int verticalMiddle = (HEIGHT / 2);
    graphics.drawLine(x, y, horizontalMiddle, verticalMiddle);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
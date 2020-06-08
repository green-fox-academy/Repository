import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    int size = 100;
    int horizontalMiddle = (WIDTH / 2);
    int verticalMiddle = (HEIGHT / 2);
    int halfSize = (size / 2);
    graphics.setColor(Color.red);
    graphics.drawLine(horizontalMiddle - halfSize, verticalMiddle - halfSize, horizontalMiddle - halfSize, verticalMiddle + halfSize);
    graphics.setColor(Color.green);
    graphics.drawLine(horizontalMiddle - halfSize, verticalMiddle - halfSize, horizontalMiddle + halfSize, verticalMiddle - halfSize);
    graphics.setColor(Color.blue);
    graphics.drawLine(horizontalMiddle - halfSize, verticalMiddle + halfSize, horizontalMiddle + halfSize, verticalMiddle + halfSize);
    graphics.setColor(Color.yellow);
    graphics.drawLine(horizontalMiddle + halfSize, verticalMiddle - halfSize, horizontalMiddle + halfSize, verticalMiddle + halfSize);
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
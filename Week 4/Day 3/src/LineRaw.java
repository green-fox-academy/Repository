import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineRaw {
  public static void mainDraw(Graphics graphics) {
    int size = 2;
    for (int x = 0; x < size + 1; x++) {
      int Width = WIDTH / size;
      int Height = HEIGHT / size;
      if (x % 2 == 1) {
        int startVertical = x * (WIDTH / 2);
        int startHorizontal = 0;
        graphics.setColor(new Color(204, 51, 255));
        repeatTop(graphics, size, startVertical, startHorizontal);
        graphics.setColor(new Color(51, 204, 51));
        repeatBot(graphics, size, startVertical, startHorizontal);
      } else {
        int startVertical = WIDTH / 2;
        int startHorizontal = x * (HEIGHT / 2);
        graphics.setColor(new Color(204, 51, 255));
        repeatTop(graphics, size, startVertical, startHorizontal);
        graphics.setColor(new Color(51, 204, 51));
        repeatBot(graphics, size, startVertical, startHorizontal);
      }
    }
  }

  public static void repeatTop(Graphics graphics, int size, int startVertical, int startHorizontal) {
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(startVertical + (i * ((WIDTH / size) / 15)), startHorizontal, (startVertical + (WIDTH / size)), startHorizontal + (i * ((HEIGHT / size) / 15)));
    }
  }

  public static void repeatBot(Graphics graphics, int size, int startVertical, int startHorizontal) {
    for (int j = 0; j < 15; j++) {
      graphics.drawLine(startVertical, startHorizontal + (j * ((HEIGHT / size) / 15)), startVertical + (j * ((WIDTH / size) / 15)), startHorizontal + (HEIGHT / size));
    }
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
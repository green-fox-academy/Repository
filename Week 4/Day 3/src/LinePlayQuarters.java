import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int size = 4;
    for (int x = 1; x <= size + 1; x++) {
      int Width = WIDTH / x;
      int Height = HEIGHT / x;
      if (x % 2 == 1) {
        int start = 0;
        graphics.setColor(new Color(204, 51, 255));
        repeatTop(graphics, size, start);
        graphics.setColor(new Color(51, 204, 51));
        repeatBot(graphics, size, start);
      } else {
        int start = WIDTH / 2;
        graphics.setColor(new Color(204, 51, 255));
        repeatTop(graphics, size, start);
        graphics.setColor(new Color(51, 204, 51));
        repeatBot(graphics, size, start);
      }
    }
  }

  public static void repeatTop(Graphics graphics, int size, int start) {
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(start + (i * ((WIDTH / size) / 15)), start, (start + (WIDTH / size)), start + (i * ((HEIGHT / size) / 15)));
    }
  }

  public static void repeatBot(Graphics graphics, int size, int start) {
    for (int j = 0; j < 15; j++) {
      graphics.drawLine(start, start + (j * ((HEIGHT / size) / 15)), start + (j * ((WIDTH / size) / 15)), start + (HEIGHT / size));
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
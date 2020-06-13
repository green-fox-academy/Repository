import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineRaw {
  public static void mainDraw(Graphics graphics) {
    int size = 2;
    for (int x = 1; x <= size + 1; x++) {
      int Width = WIDTH / x;
      int Height = HEIGHT / x;
      int start = 0;
      graphics.setColor(new Color(204, 51, 255));
      for (int i = 0; i < 15; i++) {
        graphics.drawLine (i * ((WIDTH / size) / 15), 0, (WIDTH / size), i * ((HEIGHT / size) / 15));
      }
      graphics.setColor(new Color(51, 204, 51));
      for (int j = 0; j < 15; j++) {
        graphics.drawLine(0, j * ((HEIGHT / size) / 15), j * ((WIDTH / size) / 15), (HEIGHT / size));
      }
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
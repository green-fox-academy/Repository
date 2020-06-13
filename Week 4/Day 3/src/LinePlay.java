import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(204, 51, 255));
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(i * (WIDTH / 15), 0, WIDTH, i * (HEIGHT / 15));
    }
    graphics.setColor(new Color(51, 204, 51));
    for (int j = 0; j < 15; j++) {
      graphics.drawLine(0, j * (HEIGHT / 15), j * (WIDTH / 15), HEIGHT);
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
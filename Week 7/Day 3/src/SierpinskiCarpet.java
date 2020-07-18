import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {
  private static final int LIMIT = 2;

  public static void mainDraw(Graphics graphics) {
    int width = WIDTH;
    int height = HEIGHT;
    int startX = width / 9;
    int startY = height / 9;
    int size = height / 9;

    drawRectangles(graphics, startX, startY, size, 0);
  }

  public static void drawRectangles(Graphics graphics, int startX, int startY, int size, int counter) {
    if (counter > LIMIT){
      return;
    }
    int bigStartX = 3 * startX;
    int bigStartY = 3 * startY;
    int bigSize = 3 * size;
    int horizontalMiddle = (startX * 3) + size;
    int verticalMiddle = (startY * 3) + size;
    //int horizontalMiddle = startX * 4;
    //int verticalMiddle = startY * 4;
    int end = startX * 7;
    int bottom = startY * 7;
    graphics.fillRect(bigStartX, bigStartY, bigSize, bigSize);
    graphics.fillRect(startX , startY , size, size);
    graphics.fillRect(horizontalMiddle, startY, size, size);
    graphics.fillRect(end, startY, size, size);
    graphics.fillRect(startX, verticalMiddle, size, size);
    graphics.fillRect(end, verticalMiddle, size, size);
    graphics.fillRect(startX, bottom, size, size);
    graphics.fillRect(horizontalMiddle, bottom, size, size);
    graphics.fillRect(end, bottom, size, size);

    drawRectangles(graphics, startX / 3, startY / 3, size / 3, counter +1);
    drawRectangles(graphics, horizontalMiddle / 3, startY / 3, size / 3, counter +1);
    //drawRectangles();
    //drawRectangles();
  }

  //region Static Code
  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
  //endregion
}
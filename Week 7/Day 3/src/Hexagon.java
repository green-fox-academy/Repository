import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

  public static void mainDraw(Graphics graphics) {
    int horizontalSize = WIDTH - 100;
    int verticalSize = HEIGHT - 100;
    int middleX = horizontalSize / 2;
    int middleY = verticalSize / 2;
    drawHexagon(graphics, middleX, middleY);
  }

  public static void drawHexagon(Graphics graphics, int middleX, int middleY) {
    int height = (middleY * 2);
    int width = (middleX * 2);
    graphics.drawLine(middleX - getHalfLine(middleX), 0, middleX + getHalfLine(middleX), 0);
    graphics.drawLine(middleX + getHalfLine(middleX), 0, middleX + (2 * getHalfLine(middleX)), middleY);
    graphics.drawLine(middleX + (2 * getHalfLine(middleX)), middleY, middleX + getHalfLine(middleX), height);
    graphics.drawLine(middleX + getHalfLine(middleX), height, middleX - getHalfLine(middleX), height);
    graphics.drawLine(middleX - getHalfLine(middleX), height, middleX - (2 * getHalfLine(middleX)), middleY);
    graphics.drawLine(middleX - (2 * getHalfLine(middleX)), middleY, middleX - getHalfLine(middleX), 0);
  }
    public static int getHalfLine(int halfSize){
      return (int) Math.round(halfSize *  Math.tan(Math.toRadians(30)));
    }

    //int threeQuartersWidth = 3 * startX;
    //int halfHeight = height / 2;
    //graphics.drawLine(startX, startY, threeQuartersWidth, 0);
    //graphics.drawLine(threeQuartersWidth, 0, width, halfHeight);
    //graphics.drawLine(width, halfHeight, threeQuartersWidth, height);
    //graphics.drawLine(threeQuartersWidth, height, startX, height);
    //graphics.drawLine(startX, height, 0, halfHeight);
    //graphics.drawLine(0, halfHeight, startX, startY);

  //region Static code
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
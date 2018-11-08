import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

     rainbow(0, 0, 30, graphics);
    }


    public static int rgb() {
        int min = 0;
        int max = 255;
        int rgbNum = (int) (Math.random() *
                (max - min) + 1) + min;

        return rgbNum;
    }

    public static void rainbow( int x, int y, int size, Graphics graphics) {
        int useNum = size;

        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                graphics.setColor(new Color(rgb(), rgb(), rgb()));
                graphics.fillRect(x, y, useNum, useNum);
                x = x + useNum;
            }
            x = 0;
            y = y + useNum;
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
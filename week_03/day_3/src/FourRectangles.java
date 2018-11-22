import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color(rgb(), rgb(), rgb()));
            graphics.fillRect(randomPos(), randomPos(), randomSize(), randomSize());
        }
    }

    public static int randomPos() {
        int min = 0;
        int max = 280;
        int randomPosNum = (int) (Math.random() *
                (max - min) + 1) + min;

        return randomPosNum;
    }

    public static int randomSize() {
        int min = 10;
        int max = 40;
        int randomNum = (int) (Math.random() *
                (max - min) + 1) + min;

        return randomNum;
    }

    public static int rgb() {
        int min = 0;
        int max = 255;
        int rgbNum = (int) (Math.random() *
                (max - min) + 1) + min;

        return rgbNum;
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
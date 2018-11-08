import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < generate(); i++) {
            graphics.setColor(new Color(rgb(), rgb(), rgb()));
            graphics.fillRect(posx(), posx(), 2, 2);

        }
    }

    public static int posx() {
        int max = WIDTH - 2;
        int min = 0 + 2;
        int pos = (int) (Math.random() *
                (max - min) + 1) + min;

        return pos;
    }

    public static int generate() {
        int max = 400;
        int min = 200;
        int numStar = (int) (Math.random() *
                (max - min) + 1) + min;

        return numStar;

    }


    public static int rgb() {

        int max = 255;
        int min = 0;
        int color = (int) (Math.random() *
                (max - min) + 1) + min;

        return color;
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
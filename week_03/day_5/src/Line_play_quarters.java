import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Line_play_quarters {
    public static void mainDraw(Graphics graphics) {
        //    drawMe(graphics, HEIGHT, WIDTH, 0, 0);
        int var = 0;




       for (int j = 0; j < 2; j++) {
            drawMe(graphics, HEIGHT / var, 0, 0);
            drawMe(graphics, HEIGHT / var, 0, HEIGHT/var);
            drawMe(graphics, HEIGHT / var, HEIGHT/var, 0);
            drawMe(graphics, HEIGHT / var, HEIGHT/var, HEIGHT/var);
        }

    }

    public static void drawMe(Graphics graphics, int size, int x, int y) {
        for (int i = 0; i <= size; i += 20) {
            graphics.setColor(new Color(128, 0, 128));
            graphics.drawLine(x + i, y, size + x, y + i);
            graphics.setColor(Color.green);
            graphics.drawLine(x, y + i, x + i, size + y);
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

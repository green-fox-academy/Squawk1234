
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Line_play {
    public static void mainDraw(Graphics graphics) {

    /*   graphics.drawLine(x + i, y, x2, x + i);
        int reSize = 4;

        graphics.drawLine(40/reSize, 20, 310/reSize, 40/reSize);
        graphics.drawLine(60,20, 150, 60);
        graphics.drawLine(80,20, 150, 80);
        graphics.drawLine(100,20, 150, 100);
        graphics.drawLine(120,20, 150, 120);
        graphics.drawLine(140,20, 150, 140);
        graphics.drawLine(160,20, 150, 160);
        graphics.drawLine(180,20, 150, 180);
        graphics.drawLine(200,20, 150, 200);
        graphics.drawLine(220,20, 150, 220);
        graphics.drawLine(240,20, 150, 240);
        graphics.drawLine(260,20, 150, 260);
        graphics.drawLine(280,20, 150, 280);
        graphics.drawLine(300,20, 150, 300);


*/

        int x = 40;
        int y = 40;

        for (int i = 0; i <= 260; i += 20) {
            graphics.setColor(new Color(128, 0, 128));
            graphics.drawLine(x + i, 20, 310, y + i);
            graphics.setColor(Color.green);
            graphics.drawLine(20, y + i, x + i, 310);
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
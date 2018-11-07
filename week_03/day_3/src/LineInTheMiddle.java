import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.RED);

        graphics.drawLine(350,350,200, 350);
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        graphics.setColor(new Color(145,222,255, 234));

        graphics.drawRect(100,100, 200, 200);

        graphics.fillRect(400, 500, 100, 100);


        graphics.setColor(Color.GREEN);

        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoint = 5;

      //  graphics.drawPolygon(xpoints, ypoints, npoint);


        graphics.setColor(Color.yellow);
        graphics.fillPolygon(xpoints, ypoints, npoint);

        graphics.setColor(Color.black);
        for (int i = 0; i < 50; i+= 10) {
            graphics.fillRect(i, i, 20, 20);

        }

    }

    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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
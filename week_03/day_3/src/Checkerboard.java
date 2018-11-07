import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.




        int x = 0;
        int y = 0;
        int checksize = 35;

       /* graphics.fillRect(x, y, checksize, checksize);
        graphics.fillRect(x + 40, y, checksize, checksize);
        graphics.fillRect(x + 80, y, checksize, checksize);
        graphics.fillRect(x + 120, y, checksize, checksize);
        graphics.fillRect(x + 160, y, checksize, checksize);
        graphics.fillRect(x + 200, y, checksize, checksize);
*/




            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    graphics.fillRect(x, y, checksize, checksize);
                    x = x + 70;
                }
                y += 35;
                if (i % 2 == 1){
                    x = 0;
                }
                else {
                    x = 35;
                }

            }

        }


    // Don't touch the code below
    static int WIDTH = 315;
    static int HEIGHT = 315;

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
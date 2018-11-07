import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int squareSize = 50;
/*
        graphics.drawRect(WIDTH/2-squareSize/2, HEIGHT/2-squareSize/2, squareSize,squareSize);
        graphics.drawRect(WIDTH/2-squareSize/2-10, HEIGHT/2-squareSize/2-10, squareSize +20,squareSize +20);
        graphics.drawRect(WIDTH/2-squareSize/2-20, HEIGHT/2-squareSize/2-20, squareSize +40,squareSize +40);

*/
        int sizeWidth = WIDTH/2 - squareSize/2;
        int sizeHeight = HEIGHT/2 - squareSize/2;

        for (int i = 0; i < 30; i += 10) {
            graphics.drawRect(sizeWidth - i, sizeHeight - i, squareSize + i * 2, squareSize + i * 2);
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
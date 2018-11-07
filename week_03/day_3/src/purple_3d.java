import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

        import javax.swing.*;
        import java.awt.*;

        import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

        import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purple_3d {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int squareSize = 15;
        int x = 0;
        int y= 0;

        for (int i = 0; i < 46; i += 15) {
            graphics.setColor(new Color(75, 0, 100));
            graphics.fillRect(x + i, y + i, squareSize, squareSize);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x + i, y + i, squareSize, squareSize);
            squareSize = squareSize * 2;
            x = (x * 2) + i;
            y = (y * 2) + i;

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
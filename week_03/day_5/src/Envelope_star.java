import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Envelope_star {
    public static void mainDraw(Graphics graphics) {



        int x = 40;
        int y= 40;

        for(int i=0; i<=260;  i += 20) {
            graphics.setColor(new Color(128, 0, 128));
            graphics.drawLine(x + i, 20, 310, y + i);
            graphics.setColor(Color.green);
            graphics.drawLine(20 , y + i, x + i, 310);
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
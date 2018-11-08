import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        linedraw(0,0, graphics);
    }

    public static void linedraw (int x, int y, Graphics graphics){

        for (int h = 0; h<=WIDTH; h +=WIDTH/16) {
            graphics.drawLine(x,y + h, WIDTH/2, HEIGHT/2);
            graphics.drawLine(x + h ,y, WIDTH/2, HEIGHT/2);
            graphics.drawLine(x + WIDTH - h ,y +HEIGHT, WIDTH/2, HEIGHT/2);
            graphics.drawLine(x + WIDTH,y+ HEIGHT - h, WIDTH/2, HEIGHT/2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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
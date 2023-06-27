import javax.swing.*;
import java.awt.*;

public class SceneryApplet extends JApplet {
    public void init() {
        // Set the applet size
        setSize(600, 400);
    }

    public void paint(Graphics g) {
        // Draw the sky
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the sun
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 80, 80);

        // Draw the grass
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() - 100, getWidth(), 100);

        // Draw a tree
        g.setColor(new Color(139, 69, 19));
        g.fillRect(400, getHeight() - 200, 40, 200);
        g.setColor(Color.GREEN);
        g.fillOval(370, getHeight() - 250, 100, 100);
        g.fillOval(420, getHeight() - 250, 100, 100);
        g.fillOval(470, getHeight() - 250, 100, 100);

        // Draw a house
        g.setColor(Color.RED);
        g.fillRect(200, getHeight() - 250, 200, 200);
        g.setColor(Color.WHITE);
        g.fillRect(250, getHeight() - 200, 100, 100);
        g.setColor(Color.BLACK);
        g.drawLine(250, getHeight() - 200, 350, getHeight() - 200);
        g.drawLine(300, getHeight() - 200, 300, getHeight() - 100);

        // Draw a cloud
        g.setColor(Color.WHITE);
        g.fillOval(100, 150, 60, 40);
        g.fillOval(140, 150, 60, 40);
        g.fillOval(120, 130, 60, 40);
        g.fillOval(160, 130, 60, 40);
        g.fillOval(180, 150, 60, 40);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SceneryApplet applet = new SceneryApplet();
            applet.init();

            // Create a frame to host the applet
            JFrame frame = new JFrame("Scenery Applet Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(applet);
            frame.setSize(600, 400);
            frame.setVisible(true);
        });
    }
}
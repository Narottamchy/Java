import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MovingBannerApplet extends Applet implements Runnable {
    private String bannerText; // Text to display in the banner
    private int xCoordinate; // X-coordinate of the banner

    public void init() {
        // Set the banner text
        bannerText = "I LOVE OOPS";

        // Set the initial x-coordinate
        xCoordinate = 0;

        // Set the applet background color
        setBackground(Color.WHITE);
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            // Update the x-coordinate of the banner
            xCoordinate += 5;

            // Repaint the applet
            repaint();

            // Pause the thread for 100 milliseconds
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Set the font and color for the banner text
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.setColor(Color.RED);

        // Draw the banner text at the current x-coordinate
        g.drawString(bannerText, xCoordinate, getHeight() / 2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MovingBannerApplet applet = new MovingBannerApplet();
            applet.init();
            applet.start();

            // Create a frame to host the applet
            JFrame frame = new JFrame("Moving Banner Applet Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(applet);
            frame.setSize(800, 200);
            frame.setVisible(true);
        });
    }
}
import java.awt.*;
import javax.swing.*;

public class ParameterApplet extends JApplet {
    private int intValue = 0;
    private double doubleValue = 0.0;
    private boolean booleanValue = false;
    private String stringValue = "";

    public void init() {
        // No need to use getParameter() method when running with main()
    }

    public void paint(Graphics g) {
        g.drawString("intValue: " + intValue, 10, 20);
        g.drawString("doubleValue: " + doubleValue, 10, 40);
        g.drawString("booleanValue: " + booleanValue, 10, 60);
        g.drawString("stringValue: " + stringValue, 10, 80);
    }

    public static void main(String[] args) {
        ParameterApplet applet = new ParameterApplet();
        applet.init();
        applet.start();
        applet.setSize(200, 100);

        JFrame frame = new JFrame("Parameter Applet Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.setSize(200, 100);
        frame.setVisible(true);

        // Assign values directly
        applet.intValue = 10;
        applet.doubleValue = 3.14;
        applet.booleanValue = true;
        applet.stringValue = "Hello World";
        applet.repaint();
    }
}
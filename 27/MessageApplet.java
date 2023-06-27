import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
public class MessageApplet extends Applet {
    private JLabel messageLabel;
    public void init() {
        // Create and customize the label
        messageLabel = new JLabel("Hello, World!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // Add the label to the applet
        add(messageLabel);
    }

    public void setBackground(Color color) {
        super.setBackground(color);
        if (messageLabel != null) {
            messageLabel.setBackground(color);
        }
    }
    public void setForeground(Color color) {
        super.setForeground(color);
        if (messageLabel != null) {
            messageLabel.setForeground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MessageApplet applet = new MessageApplet();
            applet.init();

            JFrame frame = new JFrame("Message Applet Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(applet);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
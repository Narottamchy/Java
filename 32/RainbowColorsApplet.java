import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RainbowColorsApplet extends JApplet implements ActionListener {
    private JPanel colorPanel;
    private JButton[] colorButtons;
    private Color[] rainbowColors = {
        Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
        Color.BLUE, new Color(75, 0, 130), new Color(238, 130, 238)
    };

    public void init() {
        colorPanel = new JPanel();
        colorButtons = new JButton[7];

        for (int i = 0; i < 7; i++) {
            JButton button = new JButton();
            button.setBackground(rainbowColors[i]);
            button.addActionListener(this);
            colorButtons[i] = button;
            colorPanel.add(button);
        }

        add(colorPanel);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            Color color = button.getBackground();
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RainbowColorsApplet applet = new RainbowColorsApplet();
            applet.init();

            JFrame frame = new JFrame("Rainbow Colors Applet Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(applet);
            frame.setSize(400, 200);
            frame.setVisible(true);
        });
    }
}
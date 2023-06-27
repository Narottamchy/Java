import java.awt.*;
import java.awt.event.*;

public class KeyboardEventDemo extends Frame implements KeyListener {
    private Label messageLabel;

    public KeyboardEventDemo() {
        // Set up the frame
        setTitle("Keyboard Event Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Create and add the label
        messageLabel = new Label("Press any key...");
        add(messageLabel);

        // Register the KeyListener
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        // Get the key code and convert it to a string
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);

        // Update the label with the key pressed
        messageLabel.setText("Key Pressed: " + keyText);
    }

    public void keyReleased(KeyEvent e) {
        // Get the key code and convert it to a string
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);

        // Update the label with the key released
        messageLabel.setText("Key Released: " + keyText);
    }

    public void keyTyped(KeyEvent e) {
        // Get the key character
        char keyChar = e.getKeyChar();

        // Update the label with the key typed
        messageLabel.setText("Key Typed: " + keyChar);
    }

    public static void main(String[] args) {
        KeyboardEventDemo demo = new KeyboardEventDemo();
        demo.setVisible(true);
    }
}

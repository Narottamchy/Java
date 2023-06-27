import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormApplet extends JApplet implements ActionListener {
    private JTextField textField;
    private JTextArea textArea;
    private JButton submitButton;

    public void init() {
        // Create components
        textField = new JTextField(20);
        textArea = new JTextArea(5, 20);
        submitButton = new JButton("Submit");

        // Create layout manager
        setLayout(new GridLayout(3, 2));

        // Add components to the applet
        add(new JLabel("Name:"));
        add(textField);
        add(new JLabel("Message:"));
        add(new JScrollPane(textArea));
        add(submitButton);

        // Register action listener for the submit button
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = textField.getText();
            String message = textArea.getText();

            // Perform some action with the form data
            System.out.println("Name: " + name);
            System.out.println("Message: " + message);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Applet Test");
        FormApplet applet = new FormApplet();
        applet.init();
        frame.getContentPane().add(applet);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
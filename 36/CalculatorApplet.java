import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApplet extends JApplet implements ActionListener {
    private JTextField numField1;
    private JTextField numField2;
    private JLabel resultLabel;

    public void init() {
        // Create components
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        resultLabel = new JLabel("Result:");

        // Create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Add components to the panel
        panel.add(numField1);
        panel.add(numField2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultLabel);

        // Add panel to the applet's content pane
        getContentPane().add(panel);

        // Register action listeners for the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0;

        if (e.getActionCommand().equals("Add")) {
            result = num1 + num2;
        } else if (e.getActionCommand().equals("Subtract")) {
            result = num1 - num2;
        }

        resultLabel.setText("Result: " + result);
    }

    public static void main(String[] args) {
        CalculatorApplet applet = new CalculatorApplet();
        applet.init();

        Frame frame = new Frame("Calculator Applet Test");
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
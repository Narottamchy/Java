import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanCalculatorApplet extends Applet implements ActionListener {
    private TextField loanAmountField;
    private TextField interestRateField;
    private TextField monthsField;
    private Checkbox monthlyRateCheckbox;
    private Label resultLabel;

    public void init() {
        // Create components
        loanAmountField = new TextField(10);
        interestRateField = new TextField(10);
        monthsField = new TextField(10);
        monthlyRateCheckbox = new Checkbox("Calculate Monthly Rate");
        Button calculateButton = new Button("Calculate");
        resultLabel = new Label("Payment Result:");

        // Create panel and set layout
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(6, 1));

        // Add components to the panel
        panel.add(new Label("Loan Amount:"));
        panel.add(loanAmountField);
        panel.add(new Label("Interest Rate:"));
        panel.add(interestRateField);
        panel.add(new Label("Number of Months:"));
        panel.add(monthsField);
        panel.add(monthlyRateCheckbox);
        panel.add(calculateButton);
        panel.add(resultLabel);

        // Add panel to the applet
        add(panel);

        // Register action listener for the calculate button
        calculateButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double loanAmount = Double.parseDouble(loanAmountField.getText());
        double interestRate = Double.parseDouble(interestRateField.getText());
        int months = Integer.parseInt(monthsField.getText());
        double payment = 0;

        if (monthlyRateCheckbox.getState()) {
            // Calculate interest rate monthly
            double monthlyInterestRate = interestRate / 100.0 / 12.0;
            payment = (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -months));
        } else {
            // Calculate interest rate annually
            double annualInterestRate = interestRate / 100.0;
            payment = (loanAmount * annualInterestRate) /
                    (1 - Math.pow(1 + annualInterestRate, -months));
        }

        resultLabel.setText("Payment Result: " + payment);
    }

    public static void main(String[] args) {
        LoanCalculatorApplet applet = new LoanCalculatorApplet();
        applet.init();

        Frame frame = new Frame("Loan Calculator Applet Test");
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
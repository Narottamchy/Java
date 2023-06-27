class Account {
    private String customerName;
    private String accountNumber;
    private String accountType;
    protected double balance;
    
    public Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited. Current balance: " + balance);
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    public void updateBalance() {
        if (accountType.equals("Savings")) {
            computeInterest();
        }
    }
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
    
    public void computeInterest() {
        // To be implemented in derived classes
    }
    
    public void imposePenalty(double penalty) {
        balance -= penalty;
        System.out.println("Penalty of " + penalty + " imposed. Current balance: " + balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current");
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    @Override
    public void imposePenalty(double penalty) {
        // No penalty for current account
    }
}

class SavingsAccount extends Account {
    private double minimumBalance;
    
    public SavingsAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Savings");
        this.minimumBalance = 1000; // Example minimum balance requirement
    }
    
    @Override
    public void computeInterest() {
        double interestRate = 0.05; // Example interest rate of 5%
        double interest = balance * interestRate;
        deposit(interest);
    }
    
    @Override
    public void imposePenalty(double penalty) {
        if (balance < minimumBalance) {
            balance -= penalty;
            System.out.println("Penalty of " + penalty + " imposed. Current balance: " + balance);
        }
    }
}

public class Exp16 {
    public static void main(String[] args) {
        CurrentAccount customer1 = new CurrentAccount("Alice Johnson", "987654");
        customer1.deposit(10000);
        customer1.displayBalance();
        customer1.withdraw(5000);
        customer1.displayBalance();

        SavingsAccount customer2 = new SavingsAccount("Bob Smith", "246810");
        customer2.deposit(5000);
        customer2.displayBalance();
        customer2.updateBalance();
        customer2.displayBalance();
        customer2.withdraw(2000);
        customer2.displayBalance();
        customer2.withdraw(3000);
        customer2.displayBalance();
        customer2.imposePenalty(100);
        customer2.displayBalance();
    }
}


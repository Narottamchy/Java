public class Factorial {
    private int number;

    // Default constructor
    public Factorial() {
        number = 0;
    }

    // Parameterized constructor
    public Factorial(int number) {
        this.number = number;
    }

    // Copy constructor
    public Factorial(Factorial factorial) {
        this.number = factorial.number;
    }

    // Calculate factorial using recursion
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        Factorial factorial1 = new Factorial();
        System.out.println("Factorial of 0 (default constructor): " + factorial1.calculateFactorial(0));

        // Using parameterized constructor
        Factorial factorial2 = new Factorial(5);
        System.out.println("Factorial of 5 (parameterized constructor): " + factorial2.calculateFactorial(5));

        // Using copy constructor
        Factorial factorial3 = new Factorial(factorial2);
        System.out.println("Factorial of 5 (copy constructor): " + factorial3.calculateFactorial(5));
    }
}

public class Exp19 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static void throwException() throws CustomException {
        throw new CustomException("Custom Exception occurred");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

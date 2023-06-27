import java.util.Random;

public class Exp8 {
    public static void main(String args[]) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println("Random number generated is: " + n);
        boolean isPrime = true;
        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}

import java.util.Scanner;

public class Exp5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Average of array elements is: " + average);
    }
}


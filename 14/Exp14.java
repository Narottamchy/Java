class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public Complex add(Complex other) {
        double realResult = real + other.real;
        double imaginaryResult = imaginary + other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }
    public Complex subtract(Complex other) {
        double realResult = real - other.real;
        double imaginaryResult = imaginary - other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }
    public Complex multiply(Complex other) {
        double realResult = real * other.real - imaginary * other.imaginary;
        double imaginaryResult = real * other.imaginary + imaginary * other.real;
        return new Complex(realResult, imaginaryResult);
    }
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realResult = (real * other.real + imaginary * other.imaginary) / denominator;
        double imaginaryResult = (imaginary * other.real - real * other.imaginary) / denominator;
        return new Complex(realResult, imaginaryResult);
    }
}

public class Exp14 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);
        
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
        System.out.println("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}
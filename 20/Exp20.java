abstract class Shape {
    public abstract void numberOfSides();
}

public class Exp20 {
    public static void main(String[] args) {
        // Creating an instance of the abstract class is not allowed
        // Shape shape = new Shape();
        
        // Creating objects of concrete classes derived from Shape
        Triangle triangle = new Triangle();
        triangle.numberOfSides();
        
        Rectangle rectangle = new Rectangle();
        rectangle.numberOfSides();
    }
}

class Triangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Rectangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

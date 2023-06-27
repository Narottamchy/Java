abstract class Shape {
    public abstract void numberOfSides();
}

class Trapezoid extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A trapezoid has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Pentagon extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A pentagon has 5 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Exp21 {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.numberOfSides();

        Triangle triangle = new Triangle();
        triangle.numberOfSides();

        Pentagon pentagon = new Pentagon();
        pentagon.numberOfSides();

        Hexagon hexagon = new Hexagon();
        hexagon.numberOfSides();
    }
}

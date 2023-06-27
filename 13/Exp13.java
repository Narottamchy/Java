class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}

public class Exp13 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7, 9);
	  int area = rect.getArea();
	  int perimeter = rect.getPerimeter();
	  System.out.println("Area: " + area);
	  System.out.println("Perimeter: " + perimeter);
    }
}


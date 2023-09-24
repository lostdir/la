// Abstract class
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculate and display the area and perimeter of the circle
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        circle.displayInfo();

        // Calculate and display the area and perimeter of the rectangle
        System.out.println("\nRectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        rectangle.displayInfo();
    }
}

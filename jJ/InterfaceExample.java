// Define an interface
interface Shape {
    double calculateArea(); // Abstract method (no body)
    double calculatePerimeter(); // Abstract method (no body)
}

// Implement the interface in a class
class Circle implements Shape {
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

// Implement the interface in another class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of classes that implement the Shape interface
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        // Calculate and display the area and perimeter
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}

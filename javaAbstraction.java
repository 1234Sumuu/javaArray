// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Concrete class representing a Circle
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to demonstrate abstraction
public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        
        // Calling methods on the objects
        rectangle.display(); // Output: This is a shape.
        System.out.println("Rectangle area: " + rectangle.calculateArea()); // Output: Rectangle area: 15.0
        
        circle.display(); // Output: This is a shape.
        System.out.println("Circle area: " + circle.calculateArea()); // Output: Circle area: 50.26548245743669
    }
}

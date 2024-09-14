class Shape {
    // Method to get the area, returns 0 as default
    public int getArea() {
        return 0; // Default implementation
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    // Using public fields for simplicity
    public int length;
    public int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to get the area of the rectangle
    @Override
    public int getArea() {
        return length * width;
    }
}

// Box class that extends Rectangle
class Box extends Rectangle {
    // Using public field for height
    public int height;

    // Constructor to initialize length, width, and height
    public Box(int length, int width, int height) {
        super(length, width); // Initialize Rectangle part
        this.height = height;
    }

    // Method to get the surface area of the box
    @Override
    public int getArea() {
        // Surface area formula for a box
        return 2 * (length * width + length * height + width * height);
    }
}

// Main class to test the shapes
public class Main {
    public static void main(String[] args) {
        // Create a Shape object and print its area
        Shape shape = new Shape();
        System.out.println("Shape area: " + shape.getArea()); // Outputs 0

        // Create a Rectangle object and print its area
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs 15

        // Create a Box object and print its surface area
        Box box = new Box(5, 3, 4);
        System.out.println("Box surface area: " + box.getArea()); // Outputs 62
    }
}
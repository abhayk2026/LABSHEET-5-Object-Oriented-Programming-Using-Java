class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();
            if (shapes[i] instanceof Circle) {
                System.out.printf("Area: %.2f%n", ((Circle) shapes[i]).calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.printf("Area: %.2f%n", ((Rectangle) shapes[i]).calculateArea());
            } else {
                System.out.println("Area not available for this shape.");
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle("Circle", 3.0), new Rectangle("Rectangle", 4.0, 5.0) };
        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}

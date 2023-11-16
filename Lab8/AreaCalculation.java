abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(3);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}

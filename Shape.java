public abstract class Shape {
    public abstract double getArea();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Triangle triangle = new Triangle(5.0, 6.0);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }
}


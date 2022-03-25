import java.util.*;

interface Shape {

    public double area();
    public double perimeter();
    public String getShape();
}

class Circle implements Shape {

    private int radius;

    Circle() {

    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override 
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override 
    public String getShape() {
        return "Circle";
    }
}

class Square implements Shape {

    private int length;

    Square() {

    }

    Square(int length, int width) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override 
    public double area() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }

    @Override 
    public String getShape() {
        return "Square";
    }
}


class Rectangle implements Shape {

    private int length;
    private int width;

    Rectangle() {

    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override 
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override 
    public String getShape() {
        return "Rectangle";
    }
}


class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equals("Circle")) {
            return new Circle();
        }
        if (shapeType.equals("Square")) {
            return new Square();
        }
        if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}


class problem1 {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("Circle");

        System.out.println(circle.getShape());
        System.out.println(circle.area());
    }
}

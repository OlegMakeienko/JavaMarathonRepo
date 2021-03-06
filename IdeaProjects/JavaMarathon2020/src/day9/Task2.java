package day9;

public class Task2 {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10,46, "red");
    rectangle.info();

    Circle circle = new Circle(6, "Red");
    circle.info();

    Triangle triangle = new Triangle(3,4,5,"Blue");
    triangle.info();

    }
}

abstract class Figure {
    private String color;


    public abstract double perimeter();
    public abstract double area();
    public void info() {
        System.out.println(perimeter() + " , " + area() + " , " + getColor());
    }

    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class Rectangle extends Figure{
    private double width;
    private double height;


    Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double perimeter() {

        return width * 2 + height * 2;

    }
    public double area() {

        return width * height;
    }
}

class Circle extends Figure{
    private double radius;
    final double P = 3.14;


    Circle (double radius, String color) {
        super(color);

        this.radius = radius;
    }
    public double perimeter() {

        return radius * 2 * P;

    }
    public double area() {

        return P * radius * radius;
    }
}

class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;


    Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double perimeter() {

        return sideA + sideB + sideC;

    }
    public double area() {

        return (Math.sqrt((sideA + sideB + sideC) * (-sideA + sideB + sideC) * (sideA - sideB + sideC) * (sideA + sideB - sideC)))/4;
    }
}
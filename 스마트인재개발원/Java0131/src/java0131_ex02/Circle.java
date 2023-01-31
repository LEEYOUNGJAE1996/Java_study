package java0131_ex02;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.pow(radius, 2) * 3.14;
    }
}

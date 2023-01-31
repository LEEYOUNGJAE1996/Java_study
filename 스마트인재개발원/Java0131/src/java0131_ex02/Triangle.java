package java0131_ex02;

public class Triangle extends Figure {
    private double base, height;

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

    // upcasting 활용을 위한
    public double area() {
        return base * height / 2;
    }
}

package java0131_ex02;

public class Triangle extends AreaCalculator {
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

    public double area() {
        return base * height / 2;
    }
}

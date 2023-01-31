package java0131_ex02;

public class AreaCalculator {
    public double area() {
        return 0;
    }

    public double calArea(Rectangle rec) {
        return rec.getWidth() * rec.getHeight();
    }

    public double calArea(Triangle tri) {
        return tri.getBase() * tri.getHeight() / 2;
    }
}

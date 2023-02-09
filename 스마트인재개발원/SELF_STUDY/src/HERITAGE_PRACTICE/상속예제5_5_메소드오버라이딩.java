package HERITAGE_PRACTICE;
//Super class
class Shape {
	public Shape next; // why next??
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
	
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class 상속예제5_5_메소드오버라이딩 {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line =new Line();
		
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}

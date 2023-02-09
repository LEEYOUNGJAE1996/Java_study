package HERITAGE_PRACTICE;

class Point{
	private int x, y ; //한 점을 구성하는 x,y 좌표
	//Point 생성자 default 
	public Point() {
		this.x = this.y = 0;
		System.out.println("super default 생성자");
	}
	//Point 클래스의 입력 생성자
	public Point(int x , int y) {
		this.x = x ;
		this.y = y;
		System.out.println("super choiced 생성자");
	}
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
//Point를 상속하는 ColorPoint 선언
class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		this.color = "black";
		System.out.println("sub default 생성자");
	}
	//ColorPoint에서 슈퍼 클래스인 Point 생성자를 선택하는 방법 by super()
	public ColorPoint(int x,int y , String color) {
		super(x,y);
		this.color = color;
		System.out.println("sub choiced 생성자");
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint 호출
	}
}

public class 상속예제5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Point");
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		System.out.println("ColorPoint didn`t set");
		ColorPoint cp = new ColorPoint();
		cp.set(2, 3);
		cp.setColor("red");
		cp.showColorPoint();
		System.out.println("ColorPoint setted");
		ColorPoint cp2 = new ColorPoint(3,4,"purple");
		cp2.showColorPoint();
	}

}

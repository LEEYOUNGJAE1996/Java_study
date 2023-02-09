package 연산자;

public class ex09_복합대입연산자 {
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		a += b;
		b -= c;
		
		System.out.println(a + "" + b);
	}
}

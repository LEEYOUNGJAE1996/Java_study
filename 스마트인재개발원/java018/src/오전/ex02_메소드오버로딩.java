package 오전;

public class ex02_메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 오버로딩(중복정의)
		// 같은 이름의 메소드를 여러개 정의하는 문법
		// (단, 매개변수의 갯수나 데이터 타입을 다르게 작성해야한다.
		int num1 = 10;
		int num2 = 20;
		int rs = addNumber(num1,num2);
		double num3 =30.14;
		double num4 = 40.20;
		double re2 = addNumber(num3,num4);
		System.out.println(rs + " " + re2);
	}

	private static double addNumber(double num3, double num4) {
		// TODO Auto-generated method stub
		return num3 + num4;
	}

	private static int addNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
}

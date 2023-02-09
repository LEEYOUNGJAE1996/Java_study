package java0117;

public class ex01_인사프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름을 넣으면 인사해주는 프로그램을 만들어보자.
		String name = "이영재";

		// 메소드 호출
		String resultStr = sayHello(name);
		System.out.print(resultStr);
	}

	private static String sayHello(String name) {

		return name + "님 안녕하세요!";
	}
}

package java0106;

import java.util.Scanner;

public class ex09_연습문제_조건문 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("User : ");
		String data = scanner.next();
		System.out.print("PC : ");
		switch (data) {
		
			case "반갑습니다.":
			case "반갑습니다":
				System.out.println("네, 반갑습니다.");
				break;
			case "안녕하세요.":
			case "안녕하세요":
				System.out.println("네, 안녕하세요.");
				break;
			case "수고하세요.":
			case "수고하세요":
				System.out.println("네, 수고하세요.");
				break;
			default:
				System.out.println("무슨 말인지 모르겠어요.");
				break;
		}

		scanner.close();
	}
}

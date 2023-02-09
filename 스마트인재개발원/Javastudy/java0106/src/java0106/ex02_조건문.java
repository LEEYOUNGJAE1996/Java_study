package java0106;

import java.util.Scanner;

public class ex02_조건문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("성인이 아닙니다.");
		}

		sc.close();
	}
}

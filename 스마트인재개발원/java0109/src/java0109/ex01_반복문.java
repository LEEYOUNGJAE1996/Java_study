package java0109;

import java.util.Scanner;

public class ex01_반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 10) {
			System.out.print("정수 입력 :");
			i = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}
}

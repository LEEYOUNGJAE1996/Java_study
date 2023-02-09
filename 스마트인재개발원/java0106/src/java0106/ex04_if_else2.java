package java0106;

import java.util.Scanner;

public class ex04_if_else2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 1) {
			System.out.println(num + "는(은) 홀수입니다. ");
		} else {
			System.out.println(num + "는(은) 짝수입니다. ");
		}

		sc.close();
	}
}

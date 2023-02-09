package java0109;

import java.util.Scanner;

public class ex04_dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("> ");
			num = sc.nextInt();

		} while (num != 0);

		System.out.println("종료되었습니다.");

		sc.close();
	}
}

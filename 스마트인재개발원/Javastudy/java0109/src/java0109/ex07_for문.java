package java0109;

import java.util.Scanner;

public class ex07_for문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 21; i < 58; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = 96; i > 52; i--) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = 21; i < 58;  i +=2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = 21; i < 58; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		sc.close();
	}
}

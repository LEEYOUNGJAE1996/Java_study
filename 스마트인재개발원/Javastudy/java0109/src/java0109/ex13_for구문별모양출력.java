package java0109;

import java.util.Scanner;

public class ex13_for구문별모양출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3행 4열
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//-----------------------------------------------------------------------------
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		// ---------------------------------------------------------------------
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 4 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		for (int k = 1; k <= 5; k++) {

			for (int i = 1; i <= 5 - k; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= k; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		// ------------------------------------------------------------------------
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= 4 - i) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		for (int k = 1; k <= 5; k++) {

			for (int i = 1; i <= 6 - k; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		sc.close();

	}
}

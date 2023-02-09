package java0109;

import java.util.Scanner;

public class ex11_이중for문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int k = 0; k < 7; k += 3) {
			for (int i = 1; i < 10; i++) {

				for (int j = 1; j < 4; j++) {
					System.out.print((j + k) + "*" + i + "=" + (j + k) * i + "\t");

				}

				System.out.print("\n");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}

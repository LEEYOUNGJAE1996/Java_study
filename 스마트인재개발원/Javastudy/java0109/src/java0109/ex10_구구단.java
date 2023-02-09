package java0109;

import java.util.Scanner;

public class ex10_구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("구하고자 하는 단수를 입력하시오 : ");
		int fir = sc.nextInt();
		
		System.out.print("곱해지는 수 입력 : ");
		int sec = sc.nextInt();
		
		for (int k = 1; k < 10; k++) {
			System.out.println(fir + "*" + k + "=" + fir * k);
		}
		for (int k = 1; k < sec; k++) {
			System.out.println(fir + "*" + k + "=" + fir * k);
		}
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(j + "*" + i + "=" + j * i);

			}
		}
		sc.close();

	}
}

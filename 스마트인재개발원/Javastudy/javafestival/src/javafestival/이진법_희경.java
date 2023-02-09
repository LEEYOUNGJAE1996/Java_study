package javafestival;

import java.util.Scanner;

public class 이진법_희경 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int n = sc.nextInt();
		int[] array = new int[32];

		int i = 0;
		while (n != 1) {
			array[i++] = n % 2;
			n = n / 2;
		}
		array[i] = n;

		for (int j = i; j >= 0; j--) {
			System.out.print(array[j]);
		}
		sc.close();
	}
}

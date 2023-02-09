package java0109;

import java.util.Scanner;

public class ex08_이중for문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir, sec;
		int sum = 0;
		System.out.print("첫 번째 정수 입력 : ");
		fir = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		sec = sc.nextInt();
		if (fir > sec) {
			int temp = fir;
			fir = sec;
			sec = temp;
		}

		for (int i = fir; i <= sec; i++) {
			System.out.print(i + " ");
			sum += i;
			
		}
		System.out.print("\n 총 합 :" + sum);
		sc.close();
	}
}

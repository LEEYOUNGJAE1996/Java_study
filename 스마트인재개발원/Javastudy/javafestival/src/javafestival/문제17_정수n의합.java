package javafestival;

import java.util.Scanner;

public class 문제17_정수n의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < num; i++) {
			// 합 구하기
			sum += i;
			System.out.print(sum + " ");

		}
		sc.close();
	}

}

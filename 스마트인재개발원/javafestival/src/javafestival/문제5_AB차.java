package javafestival;

import java.util.Scanner;

public class 문제5_AB차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B;
		boolean escape = true;
		do {
			System.out.print("A 입력 : ");
			A = sc.nextInt();
			System.out.print("B 입력 : ");
			B = sc.nextInt();
			if (A == 0 && B == 0) {
				escape = false;
			} else {
				System.out.println("결과 >> "+ (A-B));
			}
		} while (escape);

		sc.close();
	}

}

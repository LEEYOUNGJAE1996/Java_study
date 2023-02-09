package java0106;

import java.util.Scanner;

public class ex01_연습문제1 {
	public static void main(String[] args) {

		System.out.print("농구공의 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int boxN = (	count % 5 == 0 ? count / 5 : count / 5 + 1);
		System.out.println("필요한 상자의 수: " + boxN);
		
		
		sc.close();
	}
}

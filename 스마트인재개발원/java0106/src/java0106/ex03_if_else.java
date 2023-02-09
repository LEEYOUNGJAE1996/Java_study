package java0106;

import java.util.Scanner;

public class ex03_if_else {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		//변수 ---------------------------------------------------------
		int grade = sc.nextInt();
		// ------------------------------------------------------------
		// if 문 -------------------------------------------------------
		if (grade >= 60) {
			System.out.println("합격입니다.");
		}	else {
			System.out.println("불합격입니다.");
		}
		//--------------------------------------------------------------
		sc.close();
	}
}

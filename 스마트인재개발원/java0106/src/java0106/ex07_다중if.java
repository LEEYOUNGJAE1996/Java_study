package java0106;

import java.util.Scanner;

public class ex07_다중if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		char point;
		if(grade >= 90) {
			point = 'A';
		} else if(grade >= 80) {
			point = 'B';
		} else if(grade >= 70) {
			point = 'C';
		} else {
			point = 'F';
		}
		System.out.println("학점은 " + point + "입니다.");
		
		
		sc.close();
	}
}

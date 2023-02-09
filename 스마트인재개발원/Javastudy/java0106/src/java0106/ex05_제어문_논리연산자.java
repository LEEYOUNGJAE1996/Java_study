package java0106;

import java.util.Scanner;

public class ex05_제어문_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int dbGrade = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int elGrade = sc.nextInt();
		System.out.print("OS : ");
		int osGrade = sc.nextInt();
		System.out.print("데이터통신 : ");
		int dataGrade = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int softGrade = sc.nextInt();
		int sum = dbGrade + elGrade + osGrade + dataGrade + softGrade ;
		if(dbGrade < 8 || elGrade <8 || osGrade <8 || dataGrade < 8 || softGrade < 8 || sum < 60 ) {
			System.out.println("불합격입니다.");
			
		} else {
			System.out.println("합격입니다.");
		}
		
		
		sc.close();
	}

}

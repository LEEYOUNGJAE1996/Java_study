package javafestival;

import java.util.Scanner;

public class 문제15_1보다큰정수n팩토리얼구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int fac = 1;
		for(int i = 1 ; i <= num ; i++) {
			fac *= i;
		}
		System.out.println("출력 : " + fac);
		
		sc.close();
	}

}

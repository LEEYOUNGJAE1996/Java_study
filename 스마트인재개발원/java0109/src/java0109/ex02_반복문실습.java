package java0109;

import java.util.Scanner;

public class ex02_반복문실습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while(i != -1) {
			System.out.print("정수 입력('-1' 입력시 종료): ");
			i = sc.nextInt();
			sum += i;
			System.out.println("누적입력 :" + sum);
			
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

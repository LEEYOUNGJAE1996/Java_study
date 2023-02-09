package java0106;

import java.util.Scanner;

public class ex06_입장권프로그램 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int price = 20000 ; 
		int money = 0 ;
		float disc = 0.5f;
		
		if(age <20 || age >= 55) {
			money = (int)(price * disc) ;
		} else {
			money = price ;
		}
		System.out.println("입장료는 "+ money +"원 입니다.");
		sc.close();
	}
}

package javafestival;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int num = sc.nextInt();
		int money;
		if (num > 8) {
			money = (int)(5000 * (1.5*num -4)) ;
		} else {
			money = num *5000;
		}
		System.out.println("총 임금은 "+ money + "원 입니다.");
		sc.close();
	}

}

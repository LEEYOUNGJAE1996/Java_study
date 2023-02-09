package javafestival;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num %10 >4) {
			num = num /10 * 10  +10;
			System.out.println("반올림 수 : " + num);
		}else {
			num = num /10 * 10 ;
			System.out.println("반올림 수 : " + num);
		}
		sc.close();
	}

}

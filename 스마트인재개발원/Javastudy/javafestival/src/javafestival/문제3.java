package javafestival;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int money = sc.nextInt();
		int m10000, m5000 , m1000, m500, m100;
		
		m10000 = money/ 10000;
		m5000 = money % 10000 / 5000;
		m1000 = money % 5000 /1000;
		m500 = money %1000 /500;
		m100 = money %500 / 100;
		
		System.out.println("잔돈 : " + money + "원" +
							"\n 10000원 : " + m10000 + "개" +
							"\n 5000원 : " + m5000 + "개" +
							"\n 1000원 : " + m1000 + "개" +
							"\n 500원 : " + m500 + "개" +
							"\n 100원 : " + m100 + "개" 
							);
		
		
		
		sc.close();
	}

}

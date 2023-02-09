package javafestival;

import java.util.Scanner;

public class 문제30_세자리수곱하기세자리수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int fir = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		String sec = sc.next();
		int sum = 0 ;
		for(int i = sec.length()-1 ; i >= 0 ; i--  ) {
			sum += fir * (int)(sec.charAt(i)-'0') * (int)Math.pow(10,sec.length()-i-1) ;
			System.out.println(fir * (int)(sec.charAt(i)-'0'));
		}
		
		System.out.println(sum);
		sc.close();
	}

}

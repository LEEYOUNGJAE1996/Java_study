package javafestival;

import java.util.Scanner;

public class 문제35_2개의정수를받아제곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base :");
		long base = sc.nextLong();
		System.out.print("enter the n :");
		int n = sc.nextInt();
		long result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		
		
		
		
		sc.close();
		
	}
	private static long powerN(long base , int n) {
		int result = 1;
		for(int i = 1 ; i <= n ; i ++) {
			result *= base;
		}
		
		return result;
	}

}

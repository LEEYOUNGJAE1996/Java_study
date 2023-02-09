package javafestival;

import java.util.Scanner;

public class 문제25_8자리정수의각부분의합구하기 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("8자리 정수 입력 : ");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 7 ; i >=0 ; i--) {
			sum += num % (int)Math.pow(10, i+1) / (int)Math.pow(10, i);
		}
		System.out.println("합은 " +  sum + "입니다.");
		scanner.close();
	}

}

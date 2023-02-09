package javafes_0125;

import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
		System.out.println("행개수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0 ; i < 7; i++) {
			for(int j = i ; j < 7 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

package javafestival;

import java.util.Scanner;

public class 문제20_입력받아인데스의수만큼별출력 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(i+ "번째 별의 수: ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i]+ ": ");
			for(int j = 0 ; j< arr[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

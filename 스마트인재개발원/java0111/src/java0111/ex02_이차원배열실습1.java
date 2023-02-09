package java0111;

import java.util.Scanner;

public class ex02_이차원배열실습1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[3][5];
		arr[0][0] =4;
		arr[0][1] =5;
		arr[0][2] =4;
		arr[0][3] =1;
		arr[0][4] =2;
		arr[2][0] =10;
		arr[2][1] =20;
		arr[2][2] =30;
		arr[2][3] =20;
		arr[2][4] =20;
		int sum =0;
		
		
		for(int i =0 ; i < arr[1].length ; i++) {
			System.out.print((i+1)+"번째 답 >> ");
			arr[1][i] = sc.nextInt();
		}
		for(int i =0 ; i < arr[1].length ; i++) {
			if(arr[0][i] == arr[1][i]) {
				System.out.print("O\t");
				sum += arr[2][i];
			}
			else {
				System.out.print("X\t");
			}
			
		}
		System.out.println("\n총점 : " + sum + "점");
		sc.close();
		
	}
}

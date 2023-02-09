package javafestival;

import java.util.Scanner;

public class 문제10_행개수에따른삼각형출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		// 다음 행으로 넘어가는  for구문
		for(int i =0 ; i < num ; i++) {
			//행의 *을 채우기 위한  for 구문
			for(int k = 0 ; k < i+1 ; k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		sc.close();
	}

}

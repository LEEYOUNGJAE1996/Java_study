package java0110;

import java.util.Scanner;

public class ex07_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] arrint = new int[3][4];
		
		System.out.println(arrint.length);
		System.out.println(arrint[0].length);
		// 배열 초기화 동시에
		int [][] arrint2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		sc.close();
	}

}

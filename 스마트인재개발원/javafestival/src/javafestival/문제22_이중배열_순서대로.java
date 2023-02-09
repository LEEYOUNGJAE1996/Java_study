package javafestival;

import java.util.Scanner;

public class 문제22_이중배열_순서대로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.print("n 숫자를 입력하세요 : ");
				int n = sc.nextInt();
				int [][] arr = new int[n][n];
				for(int i = 0 ; i < n ; i++) {
					for(int j = 0 ; j < n ; j++) {
						if(i%2 ==0) {
							arr[i][j] = i*n + j+1;
							System.out.print(arr[i][j] + "\t");							
						}else {
							arr[i][j] = (i+1)*n - j;
							System.out.print(arr[i][j] + "\t");
						}
					}
					System.out.println();
				}
				
						sc.close();
	}

}

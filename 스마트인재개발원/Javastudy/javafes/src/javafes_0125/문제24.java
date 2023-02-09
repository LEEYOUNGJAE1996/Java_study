package javafes_0125;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >>" );
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		ArrayList<Integer> arlist = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			System.out.println((i+1) + "번째 정수 입력 >> ");
			int now = sc.nextInt();
			if(now < x) {
				arlist.add(now);
			}
		}
		System.out.print("결과 >> " );
		for(int i = 0 ; i < arlist.size() ; i++) {
			System.out.print(arlist.get(i) + "\t");
		}
		sc.close();
		
	}

}

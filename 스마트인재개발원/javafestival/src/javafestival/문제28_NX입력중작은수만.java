package javafestival;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제28_NX입력중작은수만 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int num = sc.nextInt();
		int enterNum ;
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		for(int i = 0 ; i < num ; i++) {
			System.out.print((i+1) + "번째 정수 입력 >> ");
			enterNum = sc.nextInt();
			if(x > enterNum) {
				arlist.add(enterNum);
			}
		}
		System.out.println("결과 >> " + arlist.toString());
		sc.close();
	}

}

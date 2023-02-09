package javafestival;

import java.util.Scanner;


public class 문제31_채점하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====채점하기====");
		Scanner sc = new Scanner(System.in);
		String string = sc.next().toLowerCase();
		int sum = 0 ;
		int a =1;
		for(int i = 0 ; i < string.length() ; i++) {
			if(string.charAt(i)=='o') {
				sum += a;
				a++;
			} else {
				a = 1;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}

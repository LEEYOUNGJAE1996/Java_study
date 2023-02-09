package javafestival;

import java.util.Scanner;

public class 문제32_2진수를10진수로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("이진수를 입력하시오.");
		String str = sc.next();
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			num += (int)(str.charAt(i)-'0')*Math.pow(2,str.length()-i-1);
		}
		System.out.println(str + "(2) = " + num + "(10)");
		
		sc.close();
	}

}

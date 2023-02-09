package javafestival;

import java.util.Scanner;

public class 문제16_10진수2진수로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();

		String notation2 = "";
		String reverse2 = "";

		do {
			notation2 += Integer.toString(num % 2);
			
			if(num /2 == 0) {
				
				for (int i = notation2.length() - 1; i >= 0; i--) {
					reverse2 = reverse2 + notation2.charAt(i);
				}
				break;
			}
			num /= 2;
		} while (true);
		System.out.println(reverse2);
		sc.close();
	}

}

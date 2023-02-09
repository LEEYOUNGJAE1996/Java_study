package javafestival;

import java.util.Scanner;

public class 이진법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		boolean a = true;
		String notation = "";
		String reverse = "";
		while (a) {

			if ((num / 2) == 0) {
				notation += Integer.toString(num % 2);
				// 문자열 역전하는 식
				for (int i = notation.length() - 1; i >= 0; i--) {
					reverse = reverse + notation.charAt(i);
				}
				a = false;
			} else {
				notation += Integer.toString(num % 2);
				num /= 2;
			}

		}
		System.out.println(reverse);

		String notation2 = "";
		String reverse2 = "";

		do {
			notation2 += Integer.toString(num % 2);
			num /= 2;
			if(num /2 ==0) {
				
				for (int i = notation2.length() - 1; i >= 0; i--) {
					reverse2 = reverse2 + notation2.charAt(i);
				}
				break;
			}
		} while (true);
		sc.close();
	}
}

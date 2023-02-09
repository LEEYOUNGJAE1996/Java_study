package javafestival;

import java.util.Scanner;

public class 이진법_dowhile {
	public static void main(String[] args) {
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

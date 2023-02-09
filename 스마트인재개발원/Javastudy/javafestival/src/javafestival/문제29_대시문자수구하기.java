package javafestival;

import java.util.Scanner;

public class 문제29_대시문자수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		for (int i = 0; i < num.length(); i++) {
			switch (num.charAt(i)) {
			case '0':
				sum += 6;
				break;
			case '1':
				sum += 2;
				break;
			case '2':
				sum += 5;
				break;
			case '3':
				sum += 5;
				break;
			case '4':
				sum += 4;
				break;
			case '5':
				sum += 5;
				break;
			case '6':
				sum += 6;
				break;
			case '7':
				sum += 3;
				break;
			case '8':
				sum += 7;
				break;
			case '9':
				sum += 6;
				break;

			default:
				break;
			}
		}
		System.out.println("대시('_')의 총 합 >> " + sum);
		sc.close();
	}

}

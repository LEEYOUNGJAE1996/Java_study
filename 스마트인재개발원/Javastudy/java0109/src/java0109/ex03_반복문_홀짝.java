package java0109;

import java.util.Scanner;

public class ex03_반복문_홀짝 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int even_num = 0;
		int odd_num = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if (num == -1)
				break;
			else if ((num % 2) == 0) {
				even_num++;
			} else {
				odd_num++;
			}
			System.out.println("짝수 개수: " + even_num);
			System.out.println("홀수 개수: " + odd_num);
		}
		System.out.println("종료되었습니다.");

		sc.close();
	}
}

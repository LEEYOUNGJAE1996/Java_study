package java0117;

import java.util.Scanner;

public class ex02_큰수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 정수를 입력받아 둘 중에 더 큰 수를 반환하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 수 : ");
		int num2 = sc.nextInt();

		int largeNumber = getLargeNumber(num1, num2);
		sc.close();
		System.out.print("더 큰 수 :" + largeNumber);
	}

	protected static int getLargeNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else if (num1 < num2) {
			return num2;
		} else {
			return 0;
		}

	}
}

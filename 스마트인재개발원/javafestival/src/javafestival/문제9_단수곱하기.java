package javafestival;

import java.util.Scanner;

public class 문제9_단수곱하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 :");
		int firNum = sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		int secNum = sc.nextInt();
		System.out.println(firNum + "단");
		for (int i = 1 ; i <= secNum ; i++) {
			System.out.println(firNum + "*" + i + "=" + (firNum*i));
		}
		sc.close();
	}

}

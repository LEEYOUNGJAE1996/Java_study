package javafes_0125;

import java.util.Scanner;

public class 자바19번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력: ");
		int base = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num = sc.nextInt();
		System.out.println(base + "단");
		for(int i = 1 ; i <= num ; i ++) {
			System.out.println(base + "*" + i + "="+ (base*i));
		}
		sc.close();
	}

}

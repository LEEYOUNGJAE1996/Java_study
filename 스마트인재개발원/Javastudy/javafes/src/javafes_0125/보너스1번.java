package javafes_0125;

import java.util.Scanner;

public class 보너스1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean abc = true;
		while (abc) {
			System.out.print("A입력>> ");
			a = sc.nextInt();
			System.out.print("B입력>> ");
			b = sc.nextInt();
			if (a == 0 && b == 0) {
				abc = false;
			}else {
				
				System.out.println("결과 >> " + (a - b));
			}
		}
	}

}

package java0126_ex01;

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		//setter
		cal.setNum1(num1);
		cal.setNum2(num2);
	//	while(true) {			
			System.out.println("원하는 연산을 입력하세요");
			System.out.print("1.덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 >> ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println(cal.sum());
			} else if (choice == 2) {
				System.out.println(cal.subt());
				
			} else if (choice == 3) {
				System.out.println(cal.mult());
				
			} else if (choice == 4) {
				System.out.println(cal.divid());
				
			} else {
				System.out.println("번호를 잘못 입력하셨습니다.");
				cal.initialize();
		//		break;
			}
	//	}

		sc.close();

	}

}

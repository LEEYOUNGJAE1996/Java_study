package java0127ex01;

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.start();
		
		PiggyBank pig = new PiggyBank();
		Scanner sc = new Scanner(System.in);
		int money;
		boolean success ;
		while (true) {
			menu.choiceFunt();
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("얼마를 입급하시겠습니까? >> ");
				money = sc.nextInt();
				pig.deposit(money);
			} else if (choice == 2) {
				System.out.println("얼마를 출금하시겠습니까? >> ");
				money = sc.nextInt();
				success = pig.withdraw(money);
				if(success) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
				}
			} else if (choice == 3) {
				System.out.println(pig.showMoney());
			} else if (choice == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}

		}

		sc.close();
	}

}

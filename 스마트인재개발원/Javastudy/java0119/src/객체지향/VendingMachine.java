package 객체지향;

import java.util.Scanner;

public class VendingMachine {
	// 자판기를 표현하는 역할
	// 1. 돈을 입력받는 기능
	private int money;
	Scanner sc = new Scanner(System.in);

	VendingMachine() {
		System.out.println("====자판기 프로그램====");
	};
	
	public void enterMoney() {
		System.out.print("돈을 입력하세요 : ");
		this.money = sc.nextInt();
	}

	public void selectMenu() {
		int choice = sc.nextInt();

		if (choice == 1)
			this.money -= 500;
		else if (choice == 2)
			this.money -= 800;
		else if (choice == 3)
			this.money -= 1500;
	}
	public String returnMoney() {
		if (money < 0) { // 돈이 부족
			return "잔돈이 부족합니다 ㅠㅠ";
		} else { // 잔돈 계산
			int won1000 = money / 1000; // 천원
			int won500 = money % 1000 / 500; // 오백원
			int won100 = money % 500 / 100; // 백원
			return "천원 : " + won1000 + "개, 오백원 : " + won500 + "개, 백원 : " + won100 + "개";
		}
		
	}
	
}

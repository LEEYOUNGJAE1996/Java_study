package ex03;

import java.util.Scanner;

public class VendingMachine {
	Scanner sc;
	int money;

	// 자판기를 표현하는 역할
	// 1.돈을 입력받는 기능
	public void inputMoney() {
		sc = new Scanner(System.in);
		money = sc.nextInt();
	}

	// 2.메뉴를 선택하는 기능
	public void selectMenu() {
		int choice = sc.nextInt();
		if (choice == 1)
			money -= 500;
		else if (choice == 2)
			money -= 800;
		else if (choice == 3)
			money -= 1500;
	}

	// 3.잔돈을 계산하는 기능
	public String change(Language lang) {
		if (money < 0) { // 돈이 부족
			return lang.lackOfMoney();
		} else { // 잔돈 계산
			int won1000 = money / 1000; // 천원
			int won500 = money % 1000 / 500; // 오백원
			int won100 = money % 500 / 100; // 백원
			return lang.change1000() + won1000 + lang.change500() + won500 + lang.change100() + won100;
		}
	}
}

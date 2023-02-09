package java0106;

import java.util.Scanner;

public class ex11_자판기 {
	public static void main(String[] args) {
		// 초기화
		Scanner sc = new Scanner(System.in);
		int cola = 1200;
		int soda = 1000;
		int hwanta = 1100;
		int menu = 0;
		int change;
		int c1000, c500, c100;
		
		// 금액 입력
		System.out.println("=======자판기 프로그램======");
		System.out.println("금액을 넣어주세요: ");
		int enterMoney = sc.nextInt();
		// 마실 것을 고르는!
		System.out.println("1.콜라 1200원 , 2.사이다 1000원 , 3.환타 1100원");

		
		System.out.println("마실 음료의 번호를 입력해주세요.");
		int num = sc.nextInt();
		System.out.println("몇개를 원하시나요?");
		int mul = sc.nextInt();
// 선택한 메뉴에 따른 금액 선택
		switch (num) {
		case 1:
			menu = cola;
			break;
		case 2:
			menu = soda;
			break;
		case 3:
			menu = hwanta;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
// 선택한 금액 출력
		System.out.println("총 금액은 " + (menu * mul) + "원 입니다.");
		change = enterMoney - menu * mul;
// 잔돈이 부족한 경우 메세지 출력 및 충분한 경우 거스름돈을 구함
		if (change < 0) {
			change = enterMoney;
			System.out.println("돈이 부족합니다.");
		} else {
			System.out.println("거스름돈은 " + change + "원입니다.");
		}
// 잔돈 및 남음 금액 총 반환
		c1000 = change / 1000;
		c500 = change % 1000 / 500;
		c100 = change % 1000 % 500 / 100;

		System.out.println("돌려받으실 금액은 총 " + change + "원입니다.\n" + "1000원 " + c1000 + "장\n" + "500원 " + c500 + "개\n"
				+ "100원 " + c100 + "개 입니다.\n" + "감사합니다. 안녕히가세요.");
		sc.close();
	}
}

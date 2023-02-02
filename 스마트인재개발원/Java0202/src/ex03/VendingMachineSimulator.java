package ex03;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		// 프로그램을 구동하는 역할
		// 프로그램을 사용하는 유저와 소통하는 역할(인터페이스)

		// 상속 , 다형성 , 인터페이스 등 배운 것을 활용해 확장 가능한 프로그램으로 수정
		// 목표: 언어라는 클래스와 객체를 설계하여 자판기와 연결되어 돌리는 경우
		// 영어 일본어 한국어 기타 등등 다양한 언어가 지원되도록 만드는 법
		Scanner sc = new Scanner(System.in);
		Language lang = null;
		// 언어 선택
		System.out.print("[1]한국어 [2]English [3]Spain>> ");
		int choice = sc.nextInt();
		if (choice == 1) {
			lang = new Korea();
		} else if (choice == 2) {
			lang = new English();
		} else if (choice == 3) {
			lang = new Spain();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		VendingMachine vm = new VendingMachine();
		VendingMachine vm2 = new VendingMachine();
		System.out.println(lang.menu());
		System.out.print(lang.inputMoney());
		vm.inputMoney();

		System.out.println(lang.menuList());
		System.out.print(lang.menuChoice());
		vm.selectMenu();

		String result = vm.change(lang);
		System.out.println(result);
	}

}

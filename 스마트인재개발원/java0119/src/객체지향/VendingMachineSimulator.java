package 객체지향;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램을 구동하는 역할
		// 프로그램을 사용한느 유저와 소통하는 역할(interface 역할- 하드웨어적)
		VendingMachine machine = new VendingMachine();
		
		machine.enterMoney();

		System.out.println("1.콜라(500) 2.물(800) 3.비타민워터(1500)");
		System.out.print("메뉴를 선택하세요 >>");
		machine.selectMenu();
		
		String str = machine.returnMoney();
		System.out.println(str);
	}
	

}

package javafestival;

import java.util.Scanner;

public class 문제4_몸무게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int lose;
		int count = 0;
		do {
			System.out.print(++count + "주차 감량 몸뭄게 : ");
			lose = sc.nextInt();
			weight -= lose;
			
		} while (weight >= goal);
		System.out.println(goal +"kg 달성!! 축하합니다!");
		sc.close();
	}

}

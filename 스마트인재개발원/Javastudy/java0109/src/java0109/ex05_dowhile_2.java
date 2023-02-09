package java0109;

import java.util.Scanner;

public class ex05_dowhile_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nowWeight, goalWeight, minusWeight, week;
		System.out.print("현재 무게를 입력하세요. : ");
		nowWeight = sc.nextInt();
		System.out.print("목표 무게를 입력하세요. : ");
		goalWeight = sc.nextInt();
		week = 1;
		/*
		do {
			System.out.print(week + "주차 감량한 몸무게: ");
			minusWeight = sc.nextInt();
			nowWeight -= minusWeight;
			week++;

		} while (nowWeight > goalWeight);
		*/
		
		while(nowWeight > goalWeight) {
			System.out.print(week + "주차 감량한 몸무게: ");
			minusWeight = sc.nextInt();
			nowWeight -= minusWeight;
			week++;
		}
		System.out.println(nowWeight + "kg 달성!! 축하합니다.");
		sc.close();

	}
}

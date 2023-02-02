package 오후;

import java.util.Scanner;

public class ArithmeticGameMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("=====사칙연산 게임=====");
		System.out.print("[1]덧셈 [2]뺄셈 [3]곱하기 [4]나누기 >>");
		int choice = sc.nextInt();
		if (choice == 1) {
			extracted(new PlusGame());
		} else if (choice == 2) {
			extracted(new MinusGame());
		} else if (choice == 3) {
			extracted(new MulGame());
		} else if (choice == 4) {
			extracted(new DivideGame());
		}

	}

	private static void extracted(IGame pg) {
		for (int i = 0; i < 5; i++) {

			pg.makeRandom();
			String quiz = pg.getQuizMsg();
			System.out.print(quiz);
			int input = sc.nextInt();

			if (pg.checkAnswer(input) == true) {
				System.out.println("잘 맞췄어요!");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}

}

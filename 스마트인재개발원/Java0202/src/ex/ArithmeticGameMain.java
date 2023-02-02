package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticGameMain {

	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// --------------------------------------------------------------------------------------------------------------
		Object obj = null;

		// 설정 파일 로딩
		try {
			// 파일로 불러와 클래스를 선택하는 방법
			File file = new File("C:\\Users\\young\\OneDrive\\문서\\GameList.txt");
			Scanner gameClassLoader = new Scanner(file);
			String className = gameClassLoader.next();

			// 최상위 객체 obj 구현
			// newInstance()가 의미하는 것은 무엇인가?
			obj = Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("plus game을 찾을 수 없습니다.");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		IGame gm = (IGame) obj;

		// 수업을 통한 구현
		// -------------------------------------------------------------------------------

		// 구현한 것
		System.out.println("=====사칙연산 게임=====");
		System.out.print("[1]덧셈 [2]뺄셈 [3]곱하기 [4]나누기 >>");

		int choice = sc.nextInt();
		// 수업을 중 파일을 통해 선택지 object 사용 결과
		if (choice == 1) {
			gm.makeRandom();
			System.out.println(gm.getQuizMsg());
			int input = sc.nextInt();

			if (gm.checkAnswer(input) == true) {
				System.out.println("잘 맞췄어요!");
			} else {
				System.out.println("틀렸습니다.");
			}
			// ----------------------------------------------------------------
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

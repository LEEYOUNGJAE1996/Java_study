package 연산자;

import java.util.Scanner;

public class ex14_실습2 {
	public static void main(String[] args) {
		// 시급 계산기를 만들어 본다. 9620
		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요 : ");
		int workTime = sc.nextInt();
		int money = (int) ((workTime > 8) ?
		// 참인 경우
				((workTime - 8) * 9620 * 0.5 + workTime * 9620) :
				// 거짓인 경우
				workTime * 9620);
		System.out.println("총 임금은 : " + money);

		// 삼항 x
		// 8시간이 넘는 경우와 안넘는 경우를 구분할 수 있을까? 조건문을 안쓰고??? worktime > 8 인 경우 - 8하고 가능
		// but worktime < 8 인 경우 worktime - 8 인 경우 음의 값이 나옴...
		// int a = (int)(workTime>8);
		// System.out.println( "총 임금은 : " + (workTime * 9620 + (int)((
		// *9620/2)));
		System.out.println("총 임금은 : " +
					(int)(workTime * 9620 +
					((workTime - 8) * 
					((workTime & 0x08) >> 3)|((workTime & 0x10) >>4))
					* 0.5*9620));

		sc.close();

	}
}

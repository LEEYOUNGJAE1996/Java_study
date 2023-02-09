package java0110;

import java.util.Random;
import java.util.Scanner;

public class ex06_random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int fir, sec;
		int answer;
		int count = 0;
		int life = 5;
		while (life > 0) {
			fir = rd.nextInt(10);
			sec = rd.nextInt(10);
			System.out.print(fir + "+" + sec + "=");
			answer = sc.nextInt();
			if (fir + sec == answer) {
				System.out.println("정답입니다. 남은 목숨은" + life + "개 입니다.");
				count++;
			} else {
				life--;
				System.err.println("틀렸습니다. 남은 목숨은 " + life + "개 입니다.");
			}

		}
		System.out.println("총 맞춘 갯수는 " + count + "개 입니다.");

		sc.close();
	}
}

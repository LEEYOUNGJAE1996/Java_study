package javafestival;


import java.util.Random;
import java.util.Scanner;

public class 문제12_랜덤점수답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int fir,sec;
		int answer;
		int life = 5;
		do {
			fir = random.nextInt(9)+1;
			sec = random.nextInt(9)+1;
			System.out.print(fir + " + " + sec + " = ");
			answer = sc.nextInt();
			if(answer ==fir+sec) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("FAIL...");
				life--;
			}
		} while (life !=0);
		System.out.println("GAME OVER!");
		sc.close();
	}

}

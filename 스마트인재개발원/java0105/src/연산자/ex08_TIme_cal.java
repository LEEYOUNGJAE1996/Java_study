package 연산자;

import java.util.Scanner;

public class ex08_TIme_cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter seconds : ");
		int time = sc.nextInt();
		int sec = time % 60;
		int min = time / 60 % 60;
		int hour = time / 3600 % 24;
		int day = time / 60 / 60 / 24;

		System.out.println(day + " day " + hour + " hour " + min + " minute " + sec + " second ");

		sc.close();
	}
}

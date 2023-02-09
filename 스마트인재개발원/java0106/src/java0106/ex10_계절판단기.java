package java0106;

import java.util.Scanner;

public class ex10_계절판단기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지금은 몇 월인가요?");
		int month = sc.nextInt();
		switch(month) {
		case 12:
			//System.out.println(1);
		case 1:
			//System.out.println(1);
		case 2:
			//System.out.println(1);
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3:
			//System.out.println(1);
		case 4:
			//System.out.println(1);
		case 5:
			//System.out.println(1);
			System.out.println(month + "월은 봄입니다!");
			break;	
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다!");
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
}

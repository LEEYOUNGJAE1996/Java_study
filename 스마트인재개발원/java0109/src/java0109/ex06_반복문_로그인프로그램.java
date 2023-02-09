package java0109;

import java.util.Scanner;

public class ex06_반복문_로그인프로그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean log_in = true;
		boolean rep = true;
		String id = "young";
		String pw = "1234";
		String idE, pwE;
		String answer;

		do {
			System.out.print("아이디를 입력해주세요 : ");
			idE = sc.next();
			System.out.print("비밀번호를 입력해주세요 : ");
			pwE = sc.next();
			if (id.equals(idE) && pw.equals(pwE)) {
				System.out.println("로그인 성공!!!");
				log_in = false;
			} 
			// 로그인 실패한 경우
			else {
				System.out.println("아이디 또는 비밀번호가 올바르지 않습니다. \n 다시 입력하시겠습니까?(Y/N)");
				
				rep = true ;
				while (rep) {
					answer = sc.next().toUpperCase();
					switch (answer) {
					case "Y":
						rep = false;
						break;
					case "N":
						log_in = false;
						rep = false;
						break;
					default:
						System.out.println("잘못입력하셨습니다. \n 다시 입력하시겠습니까?(Y/N) ");
						break;
					}
				}
			}

		} while (log_in);
		System.out.println("종료합니다.");
		sc.close();
	}
}

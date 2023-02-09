package 연산자;

import java.util.Scanner;

public class ex13_실습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();		
		System.out.println(((num%2)==1 ? num +"는(은) 홀수입니다." : num +"는(은) 짝수입니다."));
		
		sc.close();
	}
}

package java0110;

import java.util.Scanner;

public class ex04_배열실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 특정 10개 초기화
		//int [] numbers = {1,5,26,26,54,61,23,45,4,36,33,5,3,25,32,46};
		
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		int numbers [] = new int[10];
		for(int j = 0 ; j < numbers.length ; j++) {
			System.out.print("숫자를 입력하세요 : ");
			numbers[j] = sc.nextInt();
		}
		
		
		// 배열의 크기 아는 법  - ----> .length
		int max = numbers[0];
		int maxLocation = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
				maxLocation = i+1;
			}
			System.out.println("numbers "+ i + " : " + numbers[i] );
		}
		System.out.println("가장 큰 값은 " + maxLocation + "번째의 " + max + "입니다.");
		sc.close();
	}

}

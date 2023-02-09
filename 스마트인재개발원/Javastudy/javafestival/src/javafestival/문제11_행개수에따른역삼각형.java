package javafestival;

import java.util.Scanner;

public class 문제11_행개수에따른역삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.print("행 개수 : ");
				int num = sc.nextInt();
				// 다음 행으로 넘어가는  for구문 -10번 문제와 차이점은 
				// k 와 i를 비교하기 위해 i를 num 숫자부터 시작해서 점점 줄여나가며 출력한다.
				for(int i = num ; i  > 0; i--) {
					//행의 *을 채우기 위한  for 구문
					for(int k = 0 ; k < i ; k++) {
						System.out.print("*");				
					}
					System.out.println();
				}
				
				sc.close();
	}

}

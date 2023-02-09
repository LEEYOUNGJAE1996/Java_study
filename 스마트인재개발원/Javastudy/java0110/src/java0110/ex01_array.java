package java0110;

//import java.util.Scanner;

public class ex01_array {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		sc.close();

		// 배열 장점 1. 메모리 공간에서 인접되게 할당 - 데이터 접근속도 good
		// 2. 코드가 간결하게 적성
		// 자료형 [] 변수명 = new 자료형[할당할 크기];
		int[] numbers = new int[5];
		System.out.println(numbers);
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
		
		// 할당된 크기를 벗어난 경우
		numbers[5] = 60;
	}
}

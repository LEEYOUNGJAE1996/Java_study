package java0110;

import java.util.Scanner;

public class ex03_array_초기화 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		String[] starray = new String[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.print("좋아하는 과일 입력 : ");
//			starray[i] = sc.next();
//		}
//		System.out.print("좋아하는 과일은 ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print(starray[i] + " ");
//		}
		String[] starray = { "사과", "딸기", "오렌지", "메론", "수박" };
		System.out.print("과일명을 입력 : ");
		String comp = sc.next();
		//상태값 활용
		//순차 탐색 알고리즘>????  --> 구현 쉬움  but 데이터 많아지면 속도 느림
		//배열안에 입력한 과일 o true , x false
		boolean tOrF = false;
		//배열의 크기를 알려주는 .length
		
		
		for (int i = 0; i < starray.length; i++) {
			if (comp.equals(starray[i])) {
				System.out.println("기존 배열 중 " + (i + 1) + "번째에 " + comp + "가 존재합니다.");
				tOrF = true;
				break;
			} 
		}
		if (!tOrF) {
			System.out.println("배열에 " + comp + "이'가' 존재하지 않습니다.");
		}
		sc.close();
	}
}
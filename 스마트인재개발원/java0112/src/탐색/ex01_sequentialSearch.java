package 탐색;

import java.util.Scanner;

public class ex01_sequentialSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {13,35,15,11,26,72,78,13,61,90};
		
		int index = arr.length ;
		System.out.print("찾으시는 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == num) {
				index = i;
			}
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		if(arr.length != index) {
			System.out.println(num+ "은(는) " + (index+1 )+ "번째 숫자 입니다.");
		}else {
			System.out.println("해당 숫자는 없습니다.");
		}
		sc.close();
	}
}

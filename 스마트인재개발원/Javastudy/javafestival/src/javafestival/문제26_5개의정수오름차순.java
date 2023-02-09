package javafestival;

import java.util.Arrays;
import java.util.Scanner;

public class 문제26_5개의정수오름차순 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for(int i = 0; i < arr.length ; i++ ) {
			System.out.print((i+1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//정렬 코드
		int index = 0;
		int min;
		int temp ;
		for(int i = 0; i < arr.length ; i++ ) {
			min = arr[i];
			index = i;
			for(int k = i+1; k < arr.length ; k++ ) {
				if(min > arr[k]) {
					min = arr[k];
					index = k;
				}
			}
			if(i != index) {				
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}

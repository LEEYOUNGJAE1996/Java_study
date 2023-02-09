package 정렬;

import java.util.Arrays;

public class ex01_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 45, 7, 12, 82, 25 };
//		int num = 0; // 기준점
		int temp = 0; // 임시저장소
//		// 1step - 기준점 0~3
//		if (arr[num] > arr[num + 1]) {
//			temp = arr[num];
//			arr[num] = arr[num + 1];
//			arr[num + 1] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		num++;
//		// 2step 
//		if (arr[num] > arr[num + 1]) {
//			temp = arr[num];
//			arr[num] = arr[num + 1];
//			arr[num + 1] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		num++;

		for(int i = arr.length ; i > 0;i--) {
			for(int j = 0 ; j < i-1 ; j++ ) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
			
		}
}

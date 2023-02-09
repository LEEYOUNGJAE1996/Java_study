package 정렬;

import java.util.Arrays;

public class ex02_선택정렬 {
	public static void main(String[] args) {
		// Selection sort
		int[] arr = { 7, 98, 13, 70, 24 };
		int index = 0;
		int temp;
		System.out.println(Arrays.toString(arr));
		for (int k = 0; (k < arr.length - 1); k++) {
			// max 숫자 찾기

			for (int i = k; i < arr.length; i++) {

				if (arr[index]< arr[i]) {
					// 검증을 위해 어디서 어떻게 숫자가 바뀌는지 확인하기 위해
					System.out.println(arr[k] + " " + arr[i] );
				
					index = i;
				}
			}
			temp = arr[k];
			arr[k] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

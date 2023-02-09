package java0119;

import java.util.Arrays;

public class ex03_배열덧셈메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 개의 정수형 배열을 입력으로 받아
		//한개의 정수형 배열로 병합하여 반환하는 메소드?
		// 메소드 이름 : concatArray
		//입력 -> {1,2,3} / {9,11,6}
		int [] arr1 = {1,2,3};
		int [] arr2 = {9,11,23,14};
		int [] arr =concatArray(arr1,arr2);
		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] concatArray(int [] arr1, int [] arr2) {
		
		int [] arr = new int[arr1.length + arr2.length];
		for(int i = 0 ; i < arr1.length ; i++) {
			arr[i] = arr1[i];
		}
		for(int i = 0 ; i <  arr2.length ; i++) {
			arr[i+arr1.length] = arr2[i];
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}

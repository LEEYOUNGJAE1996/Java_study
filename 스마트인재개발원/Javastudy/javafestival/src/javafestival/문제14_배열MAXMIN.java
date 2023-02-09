package javafestival;

import java.util.Arrays;
import java.util.Random;

public class 문제14_배열MAXMIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] arr = new int[8];
		// 랜덤수로 배열 초기화
		for (int i = 0; i < 8; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(arr));
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < 8; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}

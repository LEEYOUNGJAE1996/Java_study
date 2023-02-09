package java0117;

import java.util.Arrays;

public class ex07_Sort클래스사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,23,45,4,67};
		Sort sr = new Sort();
		sr.bubbleSort(arr);
		System.out.print(Arrays.toString(arr));
	}

}

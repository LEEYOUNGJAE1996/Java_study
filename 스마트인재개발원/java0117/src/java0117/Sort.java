package java0117;

public class Sort {
	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i >= 1; i--) {
			for (int num = 0; num < i; num++) {
				if (array[num] < array[num + 1]) {
					// 치환
					int temp = array[num];
					array[num] = array[num + 1];
					array[num + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] array) {
		for (int num = 0; num < array.length - 1; num++) { // 기준점 변수
			// 큰 수 찾기 알고리즘
			int bigIndex = num;
			for (int i = num; i < array.length; i++) {
				if (array[bigIndex] < array[i]) {
					bigIndex = i;
				}
			}
			// 기준과 큰수 값을 치환
			int temp = array[num];
			array[num] = array[bigIndex];
			array[bigIndex] = temp;

		}
	}
}

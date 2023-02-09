package javafestival;

public class 문제23_거리비교 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int diff, diff1, diff2, min;
		if (point[0] - point[1] < 0) {
			diff = point[0] - point[1];
		} else {
			diff = point[0] - point[1];
		}
		min = diff ;
		diff1 = 0;
		diff2 =1;
		for (int i = 0; i < point.length-1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (point[i] - point[j] < 0) {
					diff = point[j] - point[i];
				} else {
					diff = point[i] - point[j];
				}
				if(min > diff) {
					min = diff;
					diff1 =i;
					diff2 =j;
					//System.out.println("result = [" + diff1 + "," + diff2 + "]" );
				}
			}
		}
		System.out.println("result = [" + diff1 + "," + diff2 + "]" );
	}

}

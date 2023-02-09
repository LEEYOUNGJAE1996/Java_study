package java0110;

import java.util.Scanner;

public class ex__05배열실습3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] intarr = new int[5];
		for (int i = 0; i < intarr.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			intarr[i] = sc.nextInt();
		}
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < intarr.length; i++) {
			System.out.print(intarr[i] + "\t");
		}
		int max, min, sum;
		max = intarr[0];
		min = intarr[0];
		sum = 0;

		for (int i = 0; i < intarr.length; i++) {
			// 최고 점수
			if (max < intarr[i]) {
				max = intarr[i];
			}
			// 최저 점수

			if (min > intarr[i]) {
				min = intarr[i];
			}
			// 총합
			sum += intarr[i];
		}

		System.out.println("\n최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 점수 : " + sum);
		System.out.println("평균 점수 : " + (sum / intarr.length));

		// 평균

		sc.close();
	}
}

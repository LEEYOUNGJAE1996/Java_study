package javafestival;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제36_알파벳의빈도를구해라 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> arlist = new ArrayList<Character>();
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] arrnum = new int[26];
		System.out.println("===== 알파벳 빈도수 구하기 =====");
		System.out.print("입력 >> ");
		String str = sc.nextLine().toLowerCase();
		System.out.println(str);
		for(int i = 0 ; i <str.length() ; i++) {
			arlist.add(str.charAt(i));
		}
		for (int i = 0; i < arlist.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arlist.get(i) == arr[j]) {
					arrnum[j]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " : " + arrnum[i]);
		}
		sc.close();
	}

}

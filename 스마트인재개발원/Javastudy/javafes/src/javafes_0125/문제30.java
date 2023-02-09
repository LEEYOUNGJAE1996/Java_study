package javafes_0125;

import java.util.Scanner;

public class 문제30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>>" );
		String str = sc.nextLine().toLowerCase();
		char [] ap = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
					's','t','u','v','w','x','y','z'};
		int[] count = new int[26];
		for(int i = 0 ; i < ap.length ; i++) {
			count[i] = 0;
		}
		for(int i = 0 ; i <str.length() ; i++) {
			for( int j =0 ; j < ap.length ; j++) {
				if(str.charAt(i)== ap[j]) {
					count[j] += 1;
				}
			}
		}
		for(int i = 0 ; i <ap.length ; i++) {
			System.out.println(ap[i]+ " : " + count[i]);
		}
		sc.close();
	}

}

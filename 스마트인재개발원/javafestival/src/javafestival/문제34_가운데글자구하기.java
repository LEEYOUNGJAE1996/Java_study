package javafestival;

import java.util.ArrayList;

public class 문제34_가운데글자구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddle("power"));
	}

	private static ArrayList<Character> getMiddle(String str) {
		ArrayList<Character> arlist = new ArrayList<Character>();

		if (str.length() % 2 == 1) {
			arlist.add(str.charAt(str.length()/2));
		} else {
			arlist.add(str.charAt(str.length()/2 -1)) ;			
			arlist.add(str.charAt(str.length()/2 )) ;			
		}

		return arlist;
	}
}

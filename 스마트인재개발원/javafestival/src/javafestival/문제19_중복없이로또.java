package javafestival;

import java.util.*;

public class 문제19_중복없이로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		Random random = new Random();
		int num;
		boolean al = false;
		num = random.nextInt(44) + 1;
		arlist.add(num);
		System.out.println("행운의숫자 : " + num);
		while (arlist.size() != 6) {
			num = random.nextInt(44) + 1;
			for (int i = 0; i < arlist.size(); i++) {
				if (arlist.get(i) != num) {
					al = false;
				} else {
					al = true;
				}
			}
			if (!al) {
				arlist.add(num);
				System.out.println("행운의숫자 : " + num);
			}
		}

	}

}

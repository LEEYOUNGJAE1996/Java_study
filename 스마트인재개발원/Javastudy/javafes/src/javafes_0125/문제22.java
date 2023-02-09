package javafes_0125;

public class 문제22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 5 ; i > 0 ; i--) {
			for(int j = 1 ; j < 6 ; j++) {
				if(j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

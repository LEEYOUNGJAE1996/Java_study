package javafestival;

public class 문제24_성적학생수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int cA = 0;
		int cB = 0;
		int cC = 0;
		int cD = 0;
		int cF = 0;
		for (int i = 0; i < score.length(); i++) {
			switch (score.charAt(i)) {
			case 'A':
				cA++;
				break;
			case 'B':
				cB++;
				break;
			case 'C':
				cC++;
				break;
			case 'D':
				cD++;
				break;
			case 'F':
				cF++;
				break;
			default:
				break;
			}
		}
		System.out.println("A : " + cA +"명");
		System.out.println("B : " + cB +"명");
		System.out.println("C : " + cC +"명");
		System.out.println("D : " + cD +"명");
		System.out.println("F : " + cF +"명");
	}

}

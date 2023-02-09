package javafes_0125;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1 ; i < 101 ; i++ ) {
			
			if( i % 2 == 1) {
				System.out.print(i + "\t");
				sum +=i;
			} else {
				System.out.print("-"+i+"\t");
				sum -=i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}

}

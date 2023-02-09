package javafes_0125;

public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 :" + result);
	}
	private static boolean isDivide(int num1, int num2) {
		boolean result = true;
		if( num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}

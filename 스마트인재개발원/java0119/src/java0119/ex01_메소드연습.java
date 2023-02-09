package java0119;

public class ex01_메소드연습 {
	public static void main(String[] args) {
		int [] num = {15,10,2,8,23};
		
		System.out.println("평균값은 : " + Average(num));
		
		
	}
	public static double Average(int[] num) {
		double avg;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = (double)sum / num.length;
		return avg;
	}
}

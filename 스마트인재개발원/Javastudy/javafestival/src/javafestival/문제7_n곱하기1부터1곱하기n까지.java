package javafestival;

public class 문제7_n곱하기1부터1곱하기n까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 1;
		int sum = 0;
		for (int i = 77; i >=1 ; i--) {
			sum += i * j;
			j++;
		}
		System.out.println(sum);
	}

}

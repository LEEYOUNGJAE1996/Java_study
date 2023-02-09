package 오전;

public class Numbers {
	public static boolean Dividor(int num1, int num2) {
		boolean tOrF;
		tOrF = num1 % num2 == 0 ? true : false;

		return tOrF;
	}

	public static int getSumOfDiviors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += (num % i == 0 ? i : 0);
		}
		return sum;
	}

	public static boolean isPrimeNumber(int num) {
		if (getSumOfDiviors(num) == (num + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPerfectNumber(int num) {
		if (getSumOfDiviors(num) - num == num) {
			return true;
		} else {
			return false;
		}
	}


}

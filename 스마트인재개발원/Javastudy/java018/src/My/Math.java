package My;

public class Math {
	public static int getLargeNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else if (num1 < num2) {
			return num2;
		} else {
			return 0;
		}

	}

	public static int getAbsoluteNumber(int num1) {
		return (num1 > 0) ? num1 : -num1;
	}

	public static int changeNumber(int input) {
		return input / 10 * 10;
	}
}

package ex;

public class DivideGame implements IGame { // 곱셈
	public int num1;
	public int num2;

	@Override
	public void makeRandom() {
		num1 = (int) (Math.random() * 8.99) + 1;
		num2 = (int) (Math.random() * 8.99) + 1;
	}

	@Override
	public String getQuizMsg() {
		return num1 + "/" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int input) {
		if (num1 / num2 == input) {
			return true;
		} else {
			return false;
		}
	}

}

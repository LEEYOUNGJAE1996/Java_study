package 오후;

public class PlusGame implements IGame{
	public int num1;
	public int num2;

	@Override
	public void makeRandom() {
		num1 = (int)(Math.random() * 10);
		num2 = (int)(Math.random() * 10);
	}

	@Override
	public String getQuizMsg() {
		return num1 + "+" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int input) {
		if(num1 + num2 == input) {
			return true;
		} else {
			return false;
		}
	}
	
}

package 오후;

import java.util.Random;

public class MulGame implements IGame {
	private int num1;
	private int num2;
	Random rd = new Random();
	
	public MulGame() {
		
	}
	
	@Override
	public void makeRandom() {
		num1 = (int)(Math.random()*10);
		num2 = (int)(Math.random()*10);
	}
	
	@Override
	public String getQuizMsg() {
		return num1 + "*" + num2+"=";
	}
	
	@Override
	public boolean checkAnswer(int input) {
		if(num1 * num2==input) {
			return true;
		} else {
			return false;
		}
	}
}

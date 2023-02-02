package ex01;

import java.util.Random;

public class MinusGame implements IGame {
    private int num1;
    private int num2;
    Random rd = new Random();

    public MinusGame() {
        num1 = 0;
        num2 = 0;
    }

    @Override
    public void makeRandom() {
        // TODO Auto-generated method stub
        num1 = rd.nextInt(8) + 1;
        num2 = rd.nextInt(8) + 1;
    }

    @Override
    public String getQuizMsg() {
        // TODO Auto-generated method stub
        makeRandom();
        String str = (num1 + " - " + num2 + " = ");
        return str;
    }

    @Override
    public boolean checkAnswer(int input) {
        // TODO Auto-generated method stub
        int minus = num1 - num2;
        if (minus == input) {
            return true;
        } else {
            return false;
        }
    }

}

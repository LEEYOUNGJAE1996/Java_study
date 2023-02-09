package java0126_ex01;

public class Calculator {
	private int  num1 ;
	private int  num2;
	
	public Calculator() {
		System.out.println("계산기 생성");
	}
	
	public void setNum1(int num) {
		num1 = num;
	}
	public void setNum2(int num) {
		num2 = num;
	}
	public void initialize() {
		System.out.println("숫자를 초기화 합니다.");
		num1 = 0;
		num2 = 0;
	}
	
	
	public int sum() {
		return num1 + num2 ;
	}
	public int subt() {
		return num1 - num2 ;
	}
	public int mult() {
		return num1 * num2 ;
	}
	public double divid() {
		return (double)num1 / num2 ;
	}

}

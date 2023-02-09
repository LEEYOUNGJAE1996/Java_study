package java0119;

public class ex02_계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
		
	}
	
	private static int cal(int num1 , int num2 , char op) {
		switch (op) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2 ;
		case '/':
			return num1 / num2 ;
		case '%':
			return num1 % num2;
		default:
			System.out.print("잘못입력하셨습니다.");
			return 0;
		}
		
	}
}

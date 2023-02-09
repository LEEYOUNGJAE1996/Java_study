package javafestival;


public class 문제36_calmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 =15;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
		
	}
	private static int cal(int num1,int num2,char op) {
		int result;
		switch (op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;	
			break;
		default:
			result = 0;
			break;
		}
			
		return result;
	}
}

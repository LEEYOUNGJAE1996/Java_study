package javafes_0125;

public class 보너스3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 50;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
	}
private static int cal(int num1 , int num2 , char op) {
	int result = 0;
	switch (op) {
	case '+':
		result = num1 +num2;
		break;
	case '-':
		result = num1 -num2;
		break;
	case '*':
		result = num1 *num2;
		break;
	case '/':
		result = num1 /num2;
		break;

	default:
		result = 0;
		break;
	}
	
	
	return result;
}
}


public class ex03_산술연산자_실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 3;
		
		int p = num1 + num2 ;
		int m = num1 - num2 ;
		int multiply = num1 * num2;
		double d = (double)num1 / num2 ;
		
		System.out.println("더하기 결과는 : " + p);
		System.out.println("빼기 결과는 : " + m);
		System.out.println("곱하기 결과는 : " + multiply);
		//강제 형변환
		System.out.println("나누기 결과는 : " + d);
	}

}

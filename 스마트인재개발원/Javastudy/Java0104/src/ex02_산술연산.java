
public class ex02_산술연산 {
	public static void main(String[] args) {
		int num1 = 103;
		int num2 = 6;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		float num3 = 103.0f;
		float num4 = 6.0f;
		
		System.out.println(num3/num4);
		System.out.println(num1/ num4);
		
		String num5 = "10";
		String num6 = "7";
		System.out.println(num5 + num6);
		// 정수 + 실수 ---> 실수
		System.out.println(num1 + num5);
		// 정수 + 문자열 ----> 문자열
		System.out.println(10+7+"");
		System.out.println(8+""+2);
		System.out.println(""+5+2);
		
		
		
	}
}

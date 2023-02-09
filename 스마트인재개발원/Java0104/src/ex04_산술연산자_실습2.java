
public class ex04_산술연산자_실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456;
		
		
		System.out.println("결과확인 : "+ (num-(num%10)+1));
		num = 777;
		System.out.println("결과확인 : "+ (num-(num%10)+1));
		num = 500;
		System.out.println("결과확인 : "+ (num-(num%10)+1));
		//문자열 결과
		System.out.println("결과확인 : "+ (num/10)+1);
		num = 456; 
		System.out.println("결과확인 : "+ (num/100*100));
		num = 111;
		System.out.println("결과확인 : "+ (num-num%100));
		num = 500;
		System.out.println("결과확인 : "+ (num/100) + 0 + 0 );
		//문자열 결과
	}

}

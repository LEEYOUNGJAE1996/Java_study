package 오전;

public class ex01_메소드재활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 정수를 입력받아 (base, divisor)
		//divisor가  base의 약수인지 알려주는 메소드
		// isDivisor를 만들어봅시다.
		
		int base = 10 ;
		int divisor = 3;
		Numbers name = new Numbers();
		boolean denominator = name.Dividor(base, divisor);
		System.out.println(denominator);
		
		//정수형 변수 1개를 입력 받아
		// 입력 받은 수의 약수들의 합을 반환하는 메소드
		// getSumOfDivisors
		int num3 = 6;
		System.out.println(name.getSumOfDiviors(num3));
		//정수형 변수 1개를 입력 받아 해당 숫자가
				//소수인지 아닌지 판별하는 메소드 isPrimeNumber 를 만들어보자.
		int num4 = 13;
		int num5 = 14;
		System.out.println(name.isPrimeNumber(num4));
		System.out.println(name.isPrimeNumber(num5));
		// 정수형 변수 1개르 입력받아서
		// 해당 숫자가 완전수인지 판별하느 isPerfectNumber를 만들어보다.
		// 완전수? -> 자기 자신을 제외한 약수를 더했을 경우 자기 자신이 되는 수
		int num6 = 6;
		int num7 = 7;
		int num496 = 496;
		
		System.out.println(name.isPerfectNumber(num6));
		System.out.println(name.isPerfectNumber(num7));
		System.out.println(name.isPerfectNumber(num496));
	}

}

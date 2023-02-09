package 연산자;

public class ex11_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3 ;
		int b= 10 ;
		// not 
		System.out.println( a!= b);
		// 대소비교 -- 논리 and 
		System.out.println((a>1) && (b>a));
		System.out.println((a>b) && (b>a));
		// 논리 or 
		System.out.println((a<1) || (b<a));
		System.out.println((a>b) || (b>a));
		
		
		// 비트 and 
		System.out.println(0b1011 & 0b1111);
	}

}

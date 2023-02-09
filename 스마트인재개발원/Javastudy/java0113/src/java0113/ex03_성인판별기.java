package java0113;

public class ex03_성인판별기 {
	public static void main(String[] args) {
		boolean tOrF ;
		int age = 20;
		tOrF =predict(age);
//		if(tOrF) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
		System.out.println(tOrF? "성인입니다.":"미성년자입니다.");
	}

	private static boolean predict(int age) {
		boolean tOrF;
		if(age > 19) {
			return true ;
		} else {
			return false ;
		}
	}
}

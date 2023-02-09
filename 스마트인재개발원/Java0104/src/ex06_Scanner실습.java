import java.util.Scanner;

public class ex06_Scanner실습 {

	public static void main(String[] args) {
		//enter data by keyboard
		// Scanner 변수 선언
		// data type 변수명  = 값 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 정수를 입력받는 기능
		System.out.println("입력을 받은 값 : " +input);
	
		//data 글자 입력
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("my name is " + name);
		sc.close();
	}

}

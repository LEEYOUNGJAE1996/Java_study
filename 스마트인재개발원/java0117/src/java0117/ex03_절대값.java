package java0117;
import java.util.Scanner;
public class ex03_절대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int num1 = sc.nextInt();
		
		int absoluteNum = getAbsoluteNumber(num1);
		System.out.print("절대값은 : " + absoluteNum);
		sc.close();
	}
	public static int getAbsoluteNumber(int num1) {
//		if(num1 < 0) {
//			return -num1;
//		} else {
//			return num1;
//		}
		return (num1>0)?  num1 :  -num1 ;
	}
}

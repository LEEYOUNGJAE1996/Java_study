package java0117;
import java.util.Scanner;
public class ex04_3자리정수일의자리0으러 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int output = changeNumber(input);
		System.out.println(output);
		sc.close();
	}
	private static int changeNumber(int input) {
		return input/10*10;
	}
}

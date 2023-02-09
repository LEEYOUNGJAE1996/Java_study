import java.util.Scanner;
public class ex07_Scanner_실습2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력 : ");
		int javaGrade = sc.nextInt();
		System.out.print("Java 점수 입력 : ");
		int WebGrade = sc.nextInt();
		System.out.print("Java 점수 입력 : ");
		int AndroidGrade = sc.nextInt();
		
		
		System.out.println("합계 : " + (javaGrade + WebGrade + AndroidGrade));
		System.out.println("합계 : " + (javaGrade + WebGrade + AndroidGrade)/3);
		sc.close(); 
	}
}

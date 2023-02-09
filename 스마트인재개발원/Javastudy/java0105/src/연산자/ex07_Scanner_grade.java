package 연산자;

import java.util.Scanner;

public class ex07_Scanner_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the java grade : ");
		int java = sc.nextInt();
		System.out.print("enter the web grade : ");
		int web = sc.nextInt();
		System.out.print("enter the android grade : ");
		int android  = sc.nextInt();
		
		int sum =java + web + android;
		System.out.println("sum : " + sum );
		System.out.println("average : " + ((float)sum)/3);
		
		sc.close();
	
	}

}

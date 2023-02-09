package 성적관리프로그램;
import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램을 구동하는 역할
		//사용자와 소통하는 콘솔 인터페이스 역할!
		Student s1 = new Student("황해도","a01");
		Student s2 = new Student("선영표","a02");
		Student s4 = new Student("김보원","a04" , 80,80);
		Student s5 = new Student("김국현","a05",100,100);
		Student s3 = new Student();
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		System.out.println(s4.getName());
		System.out.println(s5.getName());
		System.out.println(s1.getjavaScore());
		System.out.println(s2.getjavaScore());
		System.out.println(s3.getjavaScore());
		System.out.println(s4.getjavaScore());
		System.out.println(s5.getjavaScore());
		System.out.println(s1.getdbScore());
		System.out.println(s2.getdbScore());
		System.out.println(s3.getdbScore());
		System.out.println(s4.getdbScore());
		System.out.println(s5.getdbScore());
		
//		s1.name = "황해도";
//		s1.studentNum = "a01";
//		s1.javaScore = 100;
//		s1.dbScore = 100;
//		s2.name = "선영표";
//		s2.studentNum = "a02";
//		s2.javaScore = 80;
//		s2.dbScore = 80;
		
	}

}

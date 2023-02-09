package java0111;

import java.util.ArrayList;
import java.util.Scanner;

public class ex04_arraylist2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name ;
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			System.out.print("팀원의 이름을 입력하세요(N을 입력하시면 멈춥니다.) : ");
			name = sc.next();
			if(name.equals("N")) {
				break;
			}
			list.add(name);
			
		}
		
		System.out.print("연구개발팀의 팀원은 ");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("입니다.");
		
		System.out.println("퇴출시킬 팀원은 :");
		name = sc.next();
		for(int i = 0 ; i < list.size() ; i++) {
			if(name.equals(list.get(i))){ 
					list.remove(0);
					break;
			}
		}
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + "\t");
		}
		
	}
}

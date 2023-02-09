package java0111;

import java.util.ArrayList;

public class ex03_arraylist {
	public static void main(String[] args) {
		//arraylist 가변리스트
		//ArrayList<데이터타입> 변수명 = new  ArrayList<데이터타입>();
		//ArrayList --- 클래스 타입 함수를 이용하는 것 so 소가로가 필요()
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		// arraylist의 크기를 알기 위함 방법은 arraylist.size()를 통해 크기를 구할 수 있따.
		System.out.println("arraylist 의 크기 arrlist.size() -> " + arlist.size());
		
		
		//값 추가하는 방법  -- 변수명.add(넣고자 하는 데이터);
		arlist.add(0);
		arlist.add(1);
		arlist.add(2);
		arlist.add(3);
		System.out.println(arlist);
		arlist.add(1,4);
		System.out.println(arlist);
		System.out.println("arraylist 의 크기 arrlist.size() -> " + arlist.size());
		
		//값을 조회 
		System.out.println("arraylist 0번쨰" + arlist.get(3));
		
		// for 문 활용해서 arraylist값 모두 조회
		for(int i = 0 ; i < arlist.size() ; i++) {
			System.out.println(arlist.get(i));
		}
		//값 제거
		arlist.remove(0);
		System.out.println("arraylist 의 크기 arrlist.size() -> " + arlist.size());
		for(int i = 0 ; i < arlist.size() ; i++) {
			System.out.println(arlist.get(i));
		}
		//arraylist 초기화
		arlist.clear();
		System.out.println("arraylist 의 크기 arrlist.size() -> " + arlist.size());
		for(int i = 0 ; i < arlist.size() ; i++) {
			System.out.println(arlist.get(i));
		}
	}
}

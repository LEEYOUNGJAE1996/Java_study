package 클래스와오브젝트;

public class Cat {
	//필드 - 속성

	private String kind; // 품종
	private String color; // 색상
	String name;
	int age;
	int stress ; //stress 정도
	int hungry ; // 허기짐
	boolean sex ; //성별

	public Cat(){
		this.kind = "잡종";
		this.color = "크림";
		this.age = 0;
		this.stress = 50;
		this.hungry = 50;
		this.sex = true;
		System.out.println("생성자 생성");
	}
	//메소드 - 행위
	public void eat(String food) {
		if(food.equals("츄르")) {
			hungry += 50;
			System.out.println("핥짝핥짝");
		} else if(food.equals("사료")){
			hungry +=20;
			System.out.println("와그작와그작");
		} else {
			System.out.println("안먹어");
		}
	}
	public void touch(String where) {
		if(where.equals("배")) {
			stress += 80;
			System.out.println("햐아아앍");
		}	else if(where.equals(where)) {
			stress -= 20;
			System.out.println("고르릉");
		} else {
			System.out.println("도망간다.");
		}
	}
	
}

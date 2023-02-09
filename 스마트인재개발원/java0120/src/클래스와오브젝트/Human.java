package 클래스와오브젝트;

public class Human {
	String name;
	int age;
	String idenNum;
	float height;
	float weight;
	boolean sleep = false;
	public Human(){
		name = "이영재";
		age = 28;
		height = 164.5f;
		weight = 74.9f;
	
	}
//	public void getInfo() {
//		System.out.println("이름 : "+this.name);
//		System.out.println("나이 : "+ this.age);
//		System.out.println("키 : "+ this.height);
//		System.out.println("몸무게 : "+ this.weight);
//	}
	
	public void eating(String food) {
		if(food.equals("돼지고기")) {
			this.weight +=0.5;
			System.out.println("몸무게 증가");
		} else if(food.equals("닭가슴살")) {
			this.weight -= 0.5;
			System.out.println("몸무게 감소");
		} else {
			this.weight +=0.2;
			System.out.println("몸무게 증가");
			System.out.println();
		}
	}
	public void getWeight() {
		System.out.println("현재 몸무게는 : " + this.weight + "kg");
	}
	public void study(String how) {
		if(how.equals("self")) {
			System.out.println("혼자 집에서 강의 들으며 공부한다.");
		} else {
			System.out.println("공부따위 때려처");
		}
	}
	public void sleep() {
		if(this.sleep == false) {
			System.out.println(this.name + " 잠들다");
			this.sleep = true;
		} else {
			System.out.println(this.name + " 잠에서 깨다");
			this.sleep = false;
		}
	}
}

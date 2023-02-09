package HERITAGE_PRACTICE;
class Person{
	public Person() {
		System.out.println("Person 생성자가 실행되었습니다.");
	}
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public Student() {
		System.out.println("Student 생성자가 실행되었습니다.");
	}
	public void set() {
		age = 30;
		name = "이영재";
		height = 165;
		//weight 는 private이므로 멤버 접근이 불가 - so setWeight함수를 통해 설정
		setWeight(75);
	}
	
}

public class 상속예제5_2_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
		System.out.print(s.age + s.name + s.height + s.getWeight());
	}

}

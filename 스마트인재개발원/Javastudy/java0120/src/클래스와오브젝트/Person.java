package 클래스와오브젝트;

public class Person {
	private String name;
	private int age;
	public Person(){
		System.out.println("사람 객체 생성");
	}
	public Person(String name) {
		this.name =name;
		System.out.println("안녕하세요. " + name +"님");
	}
	public Person(String name,  int age) {
		this.name =name;
		this.age = age;
		System.out.println("안녕하세요. " + name +"님");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
}

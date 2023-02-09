package 클래스와오브젝트;

public class PersonSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("이영재",28);
		Person person2 = new Person();
		Person person3 = person;
		
		System.out.println("person1 주소 :" + person);
		System.out.println("person2 주소 :" + person2);
		System.out.println("person3 주소 :" + person3);
		
		System.out.println("\n person2 setting");
		person2.setName("김보원");
		person2.setage(24);
		
		System.out.println("\n people  출력");
		System.out.println("안녕하세요. "+ person2.getName()+"님 " + person2.getage() +"살이 되신 것을 축하드립니다.");
		System.out.println("안녕하세요. "+ person3.getName()+"님 " + person3.getage() +"살이 되신 것을 축하드립니다.");
		
	
	}

}

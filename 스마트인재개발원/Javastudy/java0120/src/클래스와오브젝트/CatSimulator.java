package 클래스와오브젝트;

public class CatSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat soda = new Cat();
		Cat cat2 = new Cat();
		
		soda.eat("사료");
		cat2.eat("츄르");
		soda.touch("배");
		cat2.touch("엉덩이");
		
		System.out.println("1"+soda.hungry);
		System.out.println("2"+cat2.hungry);
		System.out.println("1"+soda.stress);
		System.out.println("2"+cat2.stress);

	}
}

package java0130_ex03;

public class SmartPhone extends Phone{
	public void useNet() {
		System.out.println("인터넷 사용");
	}
	public void listenMusic() {
		System.out.println(name);
		System.out.println("오트르구름");
	}
	@Override
	public void send() {
		System.out.println("띠리리리릴리어린어리ㅐ저랴");
		super.send(); // 슈퍼클래스의 call을 의미!
	}
}

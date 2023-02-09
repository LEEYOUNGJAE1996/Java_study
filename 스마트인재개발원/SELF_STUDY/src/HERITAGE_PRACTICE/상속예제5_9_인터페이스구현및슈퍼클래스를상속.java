package HERITAGE_PRACTICE;


//interface PhoneInterface {
//	final int TIMEOUT  = 10000;
//	void sendCall();
//	void receiveCall();
//	default void printLogo() {
//		System.out.println("**phone**");
//	}
//}
interface MobilePhoneInterface extends PhoneInterface {
	//인터페이스 상속
	void sendSMS();
	void receiveSMS();

}

interface MP3Interface {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x , int y) {
		return x + y;
	}
}

//SmartPhone 클래스는 PDA를 상속받고,
// mobilePhoneInterface와 MP3Interface ㅇ니터페이스에 선언된 추상 메소드를 모두 수현한다.

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔습니다~");
	}
	@Override 
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS(){
		System.out.println("문자왔어요");
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play the music");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}
	//추가 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
}


public class 상속예제5_9_인터페이스구현및슈퍼클래스를상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 = " + phone.calculate(3,5));
		phone.schedule();
	}

}

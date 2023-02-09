package HERITAGE_PRACTICE;


interface PhoneInterface{
	final int TiMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("++Phone++");
	}
}
class SamsungPhone implements PhoneInterface{
	//PhoneInterface의 모든 추상 메소드 구현 필요
	private boolean flashLight = false;
	@Override 
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화왔습니다.");
	}
	
	//추가 메소드는 마음대로 작성
	public void flash() {
		if(flashLight == false) {
			flashLight = true;
			System.out.println("불이 켜졌습니다.");
		} else {
			flashLight = false;
			System.out.println("불이 꺼졌습니다.");
		}
	}
}

public class 상속예제5_8_인터페이스구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		phone.flash();

	}

}

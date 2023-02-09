package HERITAGE_PRACTICE;

class Weapon{
	 protected int fire() {
		 return 1;
	 }
}

class Cannon extends Weapon{
	@Override
	protected int fire() {//Overriding
		return 10; //canon can kill 10 people once one shot
	}
}
public class 상속예제5_6_메소드오버라이딩_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+ weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
		
		
		
	}

}

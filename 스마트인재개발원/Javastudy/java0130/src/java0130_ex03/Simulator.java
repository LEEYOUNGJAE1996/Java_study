package java0130_ex03;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph = new Phone();
		SmartPhone sp = new SmartPhone();
		PayPhone pp = new PayPhone();
		
		pp.send();
		pp.receive();
		pp.enterMoney();
		ph.send();
		ph.receive();
		sp.send();
		sp.receive();
		sp.useNet();
		sp.listenMusic();
		
//		Phone ph2 = new SmartPhone();
//		Phone ph3 = new PayPhone();
//		
	}	

}

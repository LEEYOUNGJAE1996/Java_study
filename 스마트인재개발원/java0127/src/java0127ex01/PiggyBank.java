package java0127ex01;

public class PiggyBank {
	private int money;
	private String name;
	public PiggyBank() {
		System.out.println("저금통 생성");
		this.money = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public PiggyBank(int money) {
		System.out.println("저금통 생성");
		this.money = money;
	}

	public void deposit(int money) {
		this.money += money;
	}

	public boolean withdraw(int money) {
		if (this.money - money >= 0) {
			this.money -= money;
			return true;
		} else {
			return false;
		}
	}

	public int showMoney() {
		return money;
	}

}

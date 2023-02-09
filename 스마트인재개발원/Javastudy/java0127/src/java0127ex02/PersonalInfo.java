package java0127ex02;

public class PersonalInfo {
	private String name
				  ,phoneNumber
				  ,address;
	private int id ; // 고유번호

	//생성자
	public PersonalInfo() {
		System.out.println("객체 생성"); 
	}
	public PersonalInfo(int id) {
		this.id = id;
	}
	public PersonalInfo(String name, String phoneNumber , String address , int id) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getId() {
		return id;
	}
}

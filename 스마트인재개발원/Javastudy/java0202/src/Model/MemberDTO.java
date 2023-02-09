package Model;

public class MemberDTO {

	// field
	private String id, pw, name;
	private int age;

	// 로그인을 위한 생성자
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	// 회원가입을 위한 생성자
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public MemberDTO(String id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

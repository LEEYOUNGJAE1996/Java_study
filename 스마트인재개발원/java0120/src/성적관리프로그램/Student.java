package 성적관리프로그램;

public class Student {
	private String name;
	private String studentNum;
	private int javaScore;
	private int dbScore;

	public Student() {
		System.out.println("Student 객체 생성");
		name = "이영재";
		studentNum = "a01";
		this.javaScore = 0;
		this.dbScore = 0;
	}

	public Student(String name, String studentNum) {
		System.out.println("지정 Student 객체 생성");
		this.name = name;
		this.studentNum = studentNum;
		this.javaScore = 0;
		this.dbScore = 0;

	}

	public Student(String name, String studentNum, int javaScore, int dbScore) {
		System.out.println("지정 Student 객체 생성");
		this.name = name;
		this.studentNum = studentNum;
		this.javaScore = setScore(javaScore);
		this.dbScore = setScore(dbScore);

	}
	//getter method
	public String getName() {
		return name;
	}

	public String getStudentNum() {
		return studentNum;
	}
	//setter method
	public void setjavaScore(int score) {
		javaScore = setScore(score);
	}

	public int getjavaScore() {
		return javaScore;
	}

	public void setdbScore(int score) {
		dbScore = setScore(score);
	}

	public int getdbScore() {
		return dbScore;
	}

	private int setScore(int score) {
		if (score < 0 || score > 100) {
			return 0;
		} else {
			return score;
		}
	}

}

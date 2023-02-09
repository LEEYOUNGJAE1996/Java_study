package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Insert {
	public static void main(String[] args) {
		// ㅎ회원가입
		// JDBC 순서
		// 선행작업 -> ojdbc8.jar 파일을 가져올 것 -> 프로젝트 라이브러리에 추가
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Age : ");
		int age= sc.nextInt();
		
		
		
		// try{ //오류로 인해 중단되지 않도록 전부 try문 안에서 실행
		// 1. 연결 - JDBC 동적 로딩을 진행해야한다. jdbc driver 로딩
		// 2. 데이터베이스 연결
		// 3. sql문 작성 및 전송
		// 4. 객체 자원 반납
		// }
		Connection conn = null; 
		PreparedStatement prep = null;
		try {
			// 1. 연결 - JDBC 동적 로딩을 진행해야한다. jdbc driver 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "c##service";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url, db_id, db_pw);

			
			
			// 3. sql문 작성 및 전송
			//	String sql = "insert into member values('smart','1234','이영재',20)";
			String sql = "insert into member values(?,?,?,?)";
			
			//prepared 객체가 무슨 의미?????  -----> 안할 경우 나중에도 사용해야하는데 사용하는 방식이
			//DriverManager.getConnection(url, id, pw).prepareStatement(sql)
			prep = conn.prepareStatement(sql);
			
			// Scanner로 받은 항목 id pw name age 항목을 위 문자열 ? 부분에 넣는 방법
			// setString string에 존재하는 ? 를 대신하는 문자열 setString(int , String) -> int => index 1부터 시작			
			prep.setString(1, id);
			prep.setString(2, pw);
			prep.setString(3, name);
			prep.setInt(4, age);
			
			
			// CRUD : create(insert) read(select) update(update) delete(delete)
//			prep.executeUpdate() : insert, update, delete -> 테이블에 영향을 주는 sql문 - return type int --- 몇 행이 변경되었는지 return
//			prep.executeQuery() : select -> 테이블에 영향을 주지 않는 명령문 -> return type ResultSet;
			int cnt = prep.executeUpdate();
			System.out.println(cnt +"행이 삽입되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스에 연결 할 수 없습니다.");
		} finally {
			// 4. 객체 자원 반납
			try {
				prep.close();
				conn.close();
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

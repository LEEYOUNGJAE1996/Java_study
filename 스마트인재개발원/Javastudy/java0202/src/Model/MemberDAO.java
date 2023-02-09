package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO --> data access object -----> db의 member 테이블의 데이터를 주고 받는 기능을 모아둔 클래스
public class MemberDAO {

	Connection conn = null;
	PreparedStatement prep = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result = false;
	
	
	// 회원가입 메소드
	public int insert(MemberDTO dto) {

		connection();
		// 3. sql문 작성 및 전송
		// String sql = "insert into member values('smart','1234','이영재',20)";
		String sql = "insert into member values(?,?,?,?)";

		try {
			prep = conn.prepareStatement(sql);
			// setString string에 존재하는 ? 를 대신하는 문자열 setString(int , String) -> int => index
			// 1부터 시작
			prep.setString(1, dto.getId());
			prep.setString(2, dto.getPw());
			prep.setString(3, dto.getName());
			prep.setInt(4, dto.getAge());

			cnt = prep.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnection();

		}
		return cnt;
		// Scanner로 받은 항목 id pw name age 항목을 위 문자열 ? 부분에 넣는 방법

	}

	//로그인을 위한 생성자 메소드
	
	
	public boolean logIn(MemberDTO dto) {
		connection();
		String sql = "select * from member where id=? and pw=?";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1, dto.getId());
			prep.setString(2, dto.getPw());
			//전송
			rs = prep.executeQuery();
			if(rs.next()) {
				result =true;
			} else {
				result =false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		return result;
		
		
		
	}
	
	
	//회원정보 수정
	public int updatePw(MemberDTO dto , String pw) {
		connection();
		String sql = "update member set pw = ?  where id=? ";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1,pw);
			prep.setString(2, dto.getId());
			//전송
			cnt = prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		return cnt;
	}
	public int updateName(MemberDTO dto ,String name) {
		connection();
		String sql = "update member set name = ?  where id=? ";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1,name);
			prep.setString(2, dto.getId());
			//전송
			cnt = prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		return cnt;
	}
	public int updateAge(MemberDTO dto ,int age) {
		connection();
		String sql = "update member set age = ?  where id=? ";
		try {
			prep = conn.prepareStatement(sql);
			prep.setInt(1,age);
			prep.setString(2, dto.getId());
			//전송
			cnt = prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		return cnt;
	}
	
	public boolean findID(MemberDTO dto) {
		connection();
		String sql = "select * from member where id=? and pw =?";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1, dto.getId());
			prep.setString(2, dto.getPw());
			//전송
			rs = prep.executeQuery();
			if(rs.next()) {
				result = true;
			} else {
				result = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	// 전체 출력 
	public String allOut(){
		connection();
		String sql = "select * from member";
		String str = "id\tpw\tname\tage\n" ; 
		try {
			prep = conn.prepareStatement(sql);
			//전송
			rs = prep.executeQuery();
			while(rs.next()) {
//				str += "id : " + rs.getString(1) + " pw : " + rs.getString(2) +  " name : " + rs.getString(3) +  " age : " + rs.getInt(4) + "\n"; 
				//f 포맷팅 %d %s %f %o %x
				str += String.format("%s\t%s\t%s\t%d\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		return str;
		
	}
	
	public String partOut(MemberDTO dto) {
		connection();
//		String sql = "select * from member where id= ' "+ dto.getId() + " '  and pw = '" + dto.getPw()+"'";
		String sql = "select * from member where id=?";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1, dto.getId());
			//전송
			rs = prep.executeQuery();
			if(rs.next()) {
			
				//f 포맷팅 %d %s %f %o %x
				String str =  "id\tpw\tname\tage\n"  +String.format("%s\t%s\t%s\t%d\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				return str;
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		
		return "해당 id를 찾을 수 없습니다.";
		
	}
	
	
	
	//회원탈퇴
	
	public boolean deleteDB(MemberDTO dto) {
		
		connection();
		String sql = "delete from member where id =? and pw = ?";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1, dto.getId());
			prep.setString(2, dto.getPw());
			
			int cnt = prep.executeUpdate();
			if(cnt > 0) {
				result = true ;
			} else {
				result =  false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 보낼 수 없습니다.");
		} finally {
			disconnection();
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	private void connection() {

		try {
			// jdbc연결

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "c##service";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이브를 찾을 수 없습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스를 열 수 없습니다.");
		}
	}

	
	private void disconnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (prep != null) {
				prep.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

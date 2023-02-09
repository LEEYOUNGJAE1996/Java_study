package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ㅎ회원가입
				// JDBC 순서
				// 선행작업 -> ojdbc8.jar 파일을 가져올 것 -> 프로젝트 라이브러리에 추가
				Scanner sc = new Scanner(System.in);
				System.out.print("이름 : ");
				String name = sc.next();
				
				
				
				// try{ //오류로 인해 중단되지 않도록 전부 try문 안에서 실행
				// 1. 연결 - JDBC 동적 로딩을 진행해야한다. jdbc driver 로딩
				// 2. 데이터베이스 연결
				// 3. sql문 작성 및 전송
				// 4. 객체 자원 반납
				// }
				Connection conn = null; 
				PreparedStatement prep = null;
				ResultSet rs = null;
				try {
					// 1. 연결 - JDBC 동적 로딩을 진행해야한다. jdbc driver 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					
					
					// 2. 데이터베이스 연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "c##service";
					String db_pw = "12345";
					conn = DriverManager.getConnection(url, db_id, db_pw);

					
					
					// 3. sql문 작성 및 전송
					String sql = "select * from member";
					prep = conn.prepareStatement(sql);
					
					//prep.setString(1, name);
					
					
					// CRUD : create(insert) read(select) update(update) delete(delete)
//					prep.executeUpdate() : insert, update, delete -> 테이블에 영향을 주는 sql문 - return type int --- 몇 행이 변경되었는지 return
//					prep.executeQuery() : select -> 테이블에 영향을 주지 않는 명령문 -> return type ResultSet;
					
					
					//ResultSet --> 커서 객체  
					//DB에서 조회환 결과를 받는 역할 --> ResultSet이란 함수를 통해 새로운 양방향 통로를 생성
					rs = prep.executeQuery();
					//rs.next() return --- > true or false
//					System.out.println(rs.next());
					
					while(rs.next()) {
						String getId =rs.getString(1);
						String getPw = rs.getString("pw");
						String getName = rs.getString(3);
						int getAge = rs.getInt("age");
						System.out.println("id\tpw\tname\tage");
						//f 포맷팅 %d %s %f %o %x
						System.out.printf("id : %s\tpw : %s\tname: %s\tage : %d\n",getId,getPw,getName,getAge);
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("드라이버를 찾을 수 없습니다.");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("데이터베이스에 연결 할 수 없습니다.");
				} finally {
					// 4. 객체 자원 반납
					try {
						rs.close();
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

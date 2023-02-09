package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 회원 정보 수정
				// 해당하는 아이디의 비밀번호를 수정하는 기능
				Scanner sc = new Scanner(System.in);
				System.out.print("ID : ");
				String id = sc.next();
				
				Connection conn = null;
				PreparedStatement prep= null ;
				// 1. JDBC 로딩
				// 2. DB 연결
				// 3. sql 문 작성 및 전송
				// 4. 객체 공간 반환
				try {
					//1. 동적 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					//2. db연결
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "c##service";
					String db_pw = "12345";
					conn  =  DriverManager.getConnection(url,db_id,db_pw);
					
//					//3.sql문 작성
					String sql = "delete from member where id = ?";
					prep = conn.prepareStatement(sql);
					prep.setString(1, id);
					
					int cnt = prep.executeUpdate();
					if(cnt > 0) {
						
						System.out.println(cnt + "행이 삭제되었습니다.");
					} else {
						System.out.println("해당 id를 찾을 수 없습니다.");
					}
					
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("sql class가 존재하지 않습니다.");
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("데이터베이스와 연결을 실패했습니다.");
				} 
				finally {
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

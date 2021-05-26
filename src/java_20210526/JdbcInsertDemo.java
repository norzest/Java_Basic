package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		try { // 1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패: " + e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 2. DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc", // URL
				"kpc12", // user
				"kpc1212"); // password
			System.out.println("DB 연결 성공");
			
			// 3. SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, name, addr) ");
			sql.append("VALUES(?, ?, ?)");
			
			// 4. 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 4);
			pstmt.setString(2, "홍길동4");
			pstmt.setString(3, "런던");
			
			// 5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수: " + resultCount);
		} catch(SQLException e) {
			System.err.println("DB 연결 실패: " + e.getMessage());
		} finally { 
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
		
	} // main
} // class

package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private MemberDao() {
		try { // 1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static class Holder {
		private static final MemberDao single = new MemberDao();
	}
	public static MemberDao getInstance() {
		return Holder.single;
	}
	
	// insert
	public boolean insert(MemberDto dto) {
		boolean success = false;
		
		try {
			// 2. DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc", // URL
				"kpc12", // user
				"kpc1212"); // password
			
			// 3. SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, name, addr) ");
			sql.append("VALUES(?, ?, ?)");
			
			// 4. 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			
			// 5. SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
		
		return success;
	}
	
	// update
	public boolean update(MemberDto dto) {
		boolean success = false;
		
		try {
			// 2. DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc", // URL
				"kpc12", // user
				"kpc1212"); // password
			
			// 3. SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET name = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			
			// 4. 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());			
			pstmt.setInt(index++, dto.getNum());
			
			// 5. SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
		
		return success;
	}
	
	// delete
	public boolean delete(int num) {
		boolean success = false;
		
		try {
			// 2. DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc", // URL
				"kpc12", // user
				"kpc1212"); // password
			
			// 3. SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ? ");
			
			// 4. 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());			
			pstmt.setInt(1, num);
			
			// 5. SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
		
		return success;
	}
	
	// select
	public ArrayList<MemberDto> select(int start, int len) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();		

		try {
			// 2. DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc", // URL
				"kpc12", // user
				"kpc1212"); // password
			
			// 3. SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM member ");
			sql.append("ORDER BY num LIMIT ?, ?");
			
			// 4. 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			// 5. SQL문 전송
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index++);
				list.add(new MemberDto(num, name, addr));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
		
		return list;
	}
}

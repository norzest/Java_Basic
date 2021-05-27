package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	private static final String URL = "jdbc:mysql://localhost:3306/kpc";
	private static final String ID = "kpc12";
	private static final String PWD = "kpc1212";
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private DeptDao() {
		try { // 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static class Holder {
		private static final DeptDao single = new DeptDao();
	}
	public static DeptDao getInstance() {
		return Holder.single;
	}
	
	private void close() {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// insert
	public boolean insert(DeptDto dto) {
		boolean success = false;
		
		try {
			// DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(URL, ID, PWD);
			
			// SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept(deptno, dname, loc) ");
			sql.append("VALUES(?, ?, ?)");
			
			// 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());
			
			// SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			close();
		}
		
		return success;
	}
	
	// update
	public boolean update(DeptDto dto) {
		boolean success = false;
		
		try {
			// DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(URL, ID, PWD);
			
			// SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ? ");
			
			// 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());			
			pstmt.setInt(index++, dto.getNo());
			
			// SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			close();
		}
		
		return success;
	}
	
	// delete
	public boolean delete(int num) {
		boolean success = false;
		
		try {
			// DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(URL, ID, PWD);
			
			// SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM dept ");
			sql.append("WHERE deptno = ? ");
			
			// 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());			
			pstmt.setInt(1, num);
			
			// SQL문 전송
			pstmt.executeUpdate();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			close();
		}
		
		return success;
	}
	
	// select
	public ArrayList<DeptDto> select(int start, int len) {
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();		

		try {
			// DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(URL, ID, PWD);
			
			// SQL 문을 전송할 수 있는 prepared statement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM dept ");
			sql.append("ORDER BY deptno LIMIT ?, ?");
			
			// 바인딩 변수 설정
			pstmt = con.prepareStatement(sql.toString());			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			// SQL문 전송
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				list.add(new DeptDto(rs.getInt(index++),
									 rs.getString(index++),
									 rs.getString(index++)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally { 
			close();
		}
		
		return list;
	}
}

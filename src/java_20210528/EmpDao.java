package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmpDao {
	private static final String URL = "jdbc:mysql://localhost:3306/kpc";
	private static final String ID = "kpc12";
	private static final String PWD = "kpc1212";
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private EmpDao() {
		try { // 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static class Holder {
		private static final EmpDao single = new EmpDao();
	}
	public static EmpDao getInstance() {
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
	public boolean insert(EmpDto dto) {
		boolean success = false;
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES (?, ?, ?, ?, CURDATE(), ?, ?, ?) ");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return success;
	}
	
	// update
	public boolean update(EmpDto dto) {
		boolean success = false;
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD);

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE emp ");
			sql.append("SET ename = ?, job = ?, mgr = ?, hiredate = CURDATE(), ");
			sql.append("sal = ?, comm = ?, deptno = ? ");
			sql.append("WHERE empnp = ? ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return success;
	}
	
	// delete
	public boolean delete(int no) {
		boolean success = false;
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM emp ");
			sql.append("WHERE empno = ? ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return success;
	}
	
	// select
	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();		
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
} // class

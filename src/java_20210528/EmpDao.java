package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptNo());
			
			pstmt.executeUpdate();
			success = true;
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
			sql.append("WHERE empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptNo());
			pstmt.setInt(index++, dto.getNo());
			
			pstmt.executeUpdate();
			success = true;
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
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(0, no);
			
			pstmt.executeUpdate();
			success = true;
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

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate, '%Y/%m/%d') hiredate, sal, nvl(comm, 0) as comm, deptno FROM emp ");
			sql.append("ORDER BY hiredate desc ");
			sql.append("LIMIT ?, ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				list.add(new EmpDto(rs.getInt(index++),
						 rs.getString(index++),
						 rs.getString(index++),
						 rs.getInt(index++),
						 rs.getString(index++),
						 rs.getDouble(index++),
						 rs.getDouble(index++),
						 rs.getInt(index++)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
} // class

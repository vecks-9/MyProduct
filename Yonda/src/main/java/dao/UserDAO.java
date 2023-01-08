package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDAO {
	private final String RDB = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost/yonda_db?useSSL=false";
	private final String USER = "root";
	private final String PASS = "root";
	
	public boolean insert(User registUser) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql ="INSERT INTO user_t (userid_c, password_c) VALUES (?, ?)";
		
		System.out.println("dao check1\nID:" + registUser.getUserid() + "\nPASS:" + registUser.getPassword());
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, registUser.getUserid());
			pstmt.setString(2, registUser.getPassword());
			pstmt.execute();
			
			System.out.println("dao check2\nID:" + registUser.getUserid() + "\nPASS:" + registUser.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
					System.out.println("DB切断");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}
	
	public String findUser(String loginid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			String sql = "SELECT * FROM user_t WHERE userid_c=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginid);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String password = rs.getString("password_c");
				
				return password;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}

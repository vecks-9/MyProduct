package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private final String RDB = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost/nitroark_db?useSSL=false";
	private final String USER = "root";
	private final String PASS = "root";

	public String select(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String pass = null;
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			String sql = "SELECT * FROM user_t WHERE USERID_C=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pass = rs.getString("PASS_C");
			}
			return pass;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return pass;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return pass;
		}
		finally {
			//nullでないもののclose()をtryする
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			
		}
	}

}

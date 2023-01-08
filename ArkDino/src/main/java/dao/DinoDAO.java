package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Dino;

public class DinoDAO {

	private final String RDB = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost/nitroark_db?useSSL=false";
	private final String USER = "root";
	private final String PASS = "root";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int update(Dino dino) {//どこを更新してるかを分けるのどうやるか考え中
		return 0;
	}
	
	public int insert(Dino dino) {
		int count = 0;
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			String sql = "INSERT INTO dino_t "
					+ "(KIND_C, HP_C, STAMINA_C, WEIGHT_C, OXYGEN_C, STRENGTH_C, FOOD_C, SPEED_C, MUTATION_C) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?);";
			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, dino.getKind());
			pstmt.setInt(2, dino.getHp());
			pstmt.setInt(3, dino.getStamina());
			pstmt.setInt(4, dino.getWeight());
			pstmt.setInt(5, dino.getOxygen());
			pstmt.setInt(6, dino.getStrength());
			pstmt.setInt(7, dino.getFood());
			pstmt.setInt(8, dino.getSpeed());
			pstmt.setInt(9, dino.getMutation());
			
			count = pstmt.executeUpdate();
			
			return count;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return count;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return count;
		}
		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public List<Dino> select() {
		List<Dino> dinoList = new ArrayList<>();
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			String sql = "SELECT KIND_C, HP_C, STAMINA_C, WEIGHT_C, OXYGEN_C, STRENGTH_C, FOOD_C, SPEED_C, MUTATION_C FROM dino_t";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String kind		= rs.getString("KIND_C");
				int hp			= rs.getInt("HP_C");
				int stamina		= rs.getInt("STAMINA_C");
				int weight		= rs.getInt("WEIGHT_C");
				int oxygen		= rs.getInt("OXYGEN_C");
				int strength	= rs.getInt("STRENGTH_C");
				int food		= rs.getInt("FOOD_C");
				int speed		= rs.getInt("SPEED_C");
				int mutation	= rs.getInt("MUTATION_C");
				
				Dino dino = new Dino(kind, hp, stamina, weight, oxygen, strength, food, speed, mutation);
				dinoList.add(dino);
			}
			return dinoList;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return dinoList;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return dinoList;
		}
		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

/* DB　SQL構文
CREATE TABLE dino_t 
(REGISTID_C INT PRIMARY KEY AUTO_INCREMENT, 
KIND_C VARCHAR(64) NOT NULL, 
HP_C INT NOT NULL, 
STAMINA_C INT NOT NULL, 
WEIGHT_C INT NOT NULL, 
OXYGEN_C INT NOT NULL, 
STRENGTH_C INT NOT NULL, 
FOOD_C INT NOT NULL, 
SPEED_C INT NOT NULL, 
MUTATION_C INT NOT NULL);

INSERT INTO dino_t 
(KIND_C, HP_C, STAMINA_C, WEIGHT_C, OXYGEN_C, STRENGTH_C, FOOD_C, SPEED_C, MUTATION_C) 
VALUES 
('メイウィング', 40, 35, 38, 39, 38, 33, 18, 0);

SELECT (KIND_C, HP_C, STAMINA_C, WEIGHT_C, OXYGEN_C, STRENGTH_C, FOOD_C, SPEED_C, MUTATION_C) FROM dino_t;

UPDATE dino_t
SET 
AGE_C=75
WHERE KIND_C=(?);

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		DinosaurDAO dinoDAO = new DinosaurDAO();
		}	
}

class ManageDinosaur {
	
}

class Dinosaur {
	public Dinosaur() {
		
	}
}

class DinosaurDAO {
	
	final String URL		= "jdbc:mysql://localhost/arkdino_db?useSSL=false";
	final String USERNAME	= "root";
	final String PASSWORD	= "root";
	
	Connection connect = null;
	PreparedStatement psttmt =null;
	ResultSet rs = null;
	BufferedReader br = null;
	
	String sqlSelect = ("SELECT * FROM dinosaur_t;");
	String sqlInsert = ("INSERT INTO dinosaur_t (DINOKIND_C, HP_C, STAMINA_C, WEIGHT_C, OXYGEN_C, STRENGTH_C, FOOD_C, SPEED_C, MUTATION_C) VALUES (?,?,?,?,?,?,?,?,?)");
	
	private String DINOKIND_C = "";
	private String HP_C = "";
	private String STAMINA_C = "";
	private String WEIGHT_C = "";
	private String OXYGEN_C = "";
	private String STRENGTH_C = "";
	private String FOOD_C = "";
	private String SPEED_C = "";
	private String MUTATION_C = "";
	
//	Dinos[] dino = new Dinos();
	
	public void showList() {
		
		try {
			//接続
			connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//パラメータ付きSQL文をDBに送るためのオブジェクト作成　？
			psttmt = connect.prepareStatement(sqlSelect);
			//SQL文の実行(データ取得)
			rs = psttmt.executeQuery();
			
			System.out.println("登録された恐竜一覧\n");
			
			//データ取得したレコードの表示
			while(rs.next()) {
				DINOKIND_C = rs.getString("DINOKIND_C");
				System.out.println("恐竜の種名 : " + DINOKIND_C + "\n");
				
				HP_C = rs.getString("HP_C");
				System.out.print("体力 / " + HP_C);
				
				STAMINA_C = rs.getString("STAMINA_C");
				System.out.print("\tスタミナ / " + STAMINA_C);
				
				WEIGHT_C = rs.getString("WEIGHT_C");
				System.out.print("\t重量 / " + WEIGHT_C);
			
				OXYGEN_C = rs.getString("OXYGEN_C");
				System.out.print("\t酸素 / " + OXYGEN_C);
				
				STRENGTH_C = rs.getString("STRENGTH_C");
				System.out.print("\t筋力 / " + STRENGTH_C);
	
				FOOD_C = rs.getString("FOOD_C");
				System.out.print("\t食糧 / " + FOOD_C);
				
				SPEED_C = rs.getString("SPEED_C");
				System.out.println("\t速度 / " + SPEED_C);
				
				MUTATION_C = rs.getString("MUTATION_C");
				System.out.println("\n変異回数" + MUTATION_C);
				
				System.out.println("-----------------------------------------------------------------------------------------\n");
			}
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
			}
			
			try {
				if(psttmt != null) {
					psttmt.close();
				}
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
			}
			
			try {
				if(connect != null) {
					connect.close();
				}
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	
	}
	
	public void insertData() throws SQLException {
		
		try {
			//接続
			connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//パラメータ付きSQL文をDBに送るためのオブジェクト生成
			psttmt = connect.prepareStatement(sqlInsert);
			//文字入力
			br = new BufferedReader(new InputStreamReader(System.in));

			try {
				System.out.println("恐竜の名前を入力してください");
				DINOKIND_C = br.readLine();
				psttmt.setString(1,DINOKIND_C);
				
				System.out.println("HPを入力してください");
				HP_C = br.readLine();
				psttmt.setString(2,HP_C);
				
				System.out.println("スタミナを入力してください");
				STAMINA_C = br.readLine();
				psttmt.setString(3,STAMINA_C);
	
				System.out.println("重量を入力してください");
				WEIGHT_C = br.readLine();
				psttmt.setString(4,WEIGHT_C);
								
				System.out.println("酸素を入力してください");
				OXYGEN_C = br.readLine();
				psttmt.setString(5,OXYGEN_C);
				
				System.out.println("筋力を入力してください");
				STRENGTH_C = br.readLine();
				psttmt.setString(6,STRENGTH_C);
				
				System.out.println("食糧値を入力してください");
				FOOD_C = br.readLine();
				psttmt.setString(7,FOOD_C);
				
				System.out.println("速度を入力してください");
				SPEED_C = br.readLine();
				psttmt.setString(8,SPEED_C);
				
				System.out.println("変異回数を入力してください");
				MUTATION_C = br.readLine();
				psttmt.setString(9,MUTATION_C);
				
				//SQL文の実行
				psttmt.executeUpdate();
				
			} 
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
			finally {
				try {
					br.close();
				}
				catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			System.out.println("\n\n\n入力処理終了");
		}

	}
}
package Vendingsub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlTester {
	public static void main(String[] args) throws SQLException {
		
/*		String itemId = "";
		String itemName = "";
		int itemPrice = 0;
		int inventory = 0;*/
		
		Connection connect = DriverManager.getConnection(
				"jdbc:mysql://localhost/vendingmachine_db?useSSL=false",
				"root",
				"root"
		);
		
		System.out.println("金額を入力");
		Scanner scanner = new Scanner(System.in);
		int paymentMoney = scanner.nextInt();
		
		PreparedStatement psttmt = connect.prepareStatement("SELECT * FROM drinkitem_t WHERE ITEMPRICE_C >" + paymentMoney);
		ResultSet rs = psttmt.executeQuery();
		

		
		while(rs.next()) {
			System.out.println(rs.getString("ITEMID_C"));
			
			System.out.println(rs.getString("ITEMNAME_C"));
			
			System.out.println(rs.getInt("ITEMPRICE_C"));
			
			System.out.println(rs.getInt("INVENTORY_C"));
			
			System.out.print("\n");

			
//			System.out.print("\n**********************************************\n");
			
/*			itemId = rs.getString("ITEMID_C");
			System.out.println(itemId);
			
			itemName = rs.getString("ITEMNAME_C");
			System.out.println(itemName);
			
			itemPrice = rs.getInt("ITEMPRICE_C");
			System.out.println(itemPrice);
			
			inventory = rs.getInt("INVENTORY_C");
			System.out.println(inventory);
			
			System.out.print("\n**********************************************\n");*/
		}
		
		rs.close();
		psttmt.close();
		connect.close();

	}

}

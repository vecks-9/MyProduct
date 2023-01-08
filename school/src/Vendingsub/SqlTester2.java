package Vendingsub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//自動販売機の最初のクラスとして使う
public class SqlTester2 {
	public static void main(String[] args) throws SQLException {
		int paymentMoney = 0;
		PreparedStatement psttmt = null;
		ResultSet rs = null;
		//DBに接続
		Connection connect = DriverManager.getConnection(
				"jdbc:mysql://localhost/vendingmachine_db?useSSL=false",
				"root",
				"root"
		);
		
		//投入された金額以上のものが表示される　投入は何回でも可能
		Scanner scanner = new Scanner(System.in);
		//主な動作はfor内
		for(int i = 0; i < 1 ; i++) {
			System.out.println("投入金額を入力");
			paymentMoney += scanner.nextInt();
			
			System.out.println("投入金額：" + paymentMoney + "円");
			
			psttmt = connect.prepareStatement("SELECT * FROM drinkitem_t WHERE ITEMPRICE_C <= " + paymentMoney);
			rs = psttmt.executeQuery();
			
				while(rs.next()) {
					//System.out.println(rs.getString("ITEMID_C"));
					
					System.out.println(rs.getString("ITEMNAME_C"));
					
					System.out.println(rs.getInt("ITEMPRICE_C"));
					
					//System.out.println(rs.getInt("INVENTORY_C"));
					
					System.out.print("\n");
		
				}
			
			System.out.println("追加投入しますか？\nYes:1 / No:2 / repayment:3");
			int payJudge = scanner.nextInt();

			switch(payJudge) {
				case 1:
					i--;
					break;
				case 2:
					//商品選択メソッドに飛んでいく

					System.out.print("ここから先まだなんもしてない　きむら");
					
					System.out.print("購入する番号を選択してください(有効範囲：1～8)\n");
					break;
				case 3:
					//返金処理
					System.out.println(paymentMoney + "円を返金します。");
					paymentMoney -= paymentMoney;
					System.out.println("\n投入金額：" + paymentMoney + "円");
					break;
				default:
					System.out.println("異常な入力。終了します。" + paymentMoney + "円を返金します。");
					paymentMoney -= paymentMoney;
					System.out.println("\n投入金額：" + paymentMoney + "円");
					break;
			}
		}
		
		rs.close();
		psttmt.close();
		connect.close();
		
		System.out.println("終了");
	}

}

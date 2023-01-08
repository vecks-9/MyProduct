package Vendingsub;

import java.util.Scanner;
//改変予定：購入中止が出来る　選択のし直しが出来る
public class AllIn {
	public static void main(String[] args) {//選択番号の条件分岐追加 switch文をfor文へ 短縮
		System.out.println("launch vender\n\n\n");
		
		Vender vender	= new Vender();
		//処理時間計測メソッド 起動時刻の記録
		vender.checkStart();
		
/*
アイテム群のデータをdrinkitem.dbに保持する
CREATE DATABASE vendingmachine_db;
vendingmachine_db

自動販売機用データベースの作成
mysql> CREATE DATABASE vendingmachine_db;
Query OK, 1 row affected (0.00 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| vendingmachine_db  |
+--------------------+
7 rows in set (0.00 sec)

使用するデータベースの変更
USE vendingmachine_DB
mysql> USE vendingmachine_db
Database changed

テーブルの作成
CREATE TABLE drinkitem_t (
ITEMID_C CHAR(16) PRIMARY KEY,
ITEMNAME_C VARCHAR(32) NOT NULL,
ITEMPRICE_C INT NOT NULL,
INVENTORY_C INT NOT NULL
);

テーブルの表示
mysql> SHOW TABLES;
+-----------------------------+
| Tables_in_vendingmachine_db |
+-----------------------------+
| drinkitem_t                 |
+-----------------------------+
1 row in set (0.00 sec)

drinkitem_tの中身を表示
SHOW COLUMNS FROM drinkitem_t;

mysql> SHOW COLUMNS FROM drinkitem_t;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| ITEMID_C    | char(16)    | NO   | PRI | NULL    |       |
| ITEMNAME_C  | varchar(32) | NO   |     | NULL    |       |
| ITEMPRICE_C | int         | NO   |     | NULL    |       |
| INVENTORY_C | int         | NO   |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

例
ITEMID_C		item1001
ITEMNAME_C		綾鷹
ITEMPRICE_C		150
INENTORY_C		5

情報の挿入
INSERT INTO drinkitem_t VALUES 
('item1001', '綾鷹', 150, 5), 
('item1002', '伊藤園', 150, 5), 
('item1003', 'クラフトBOSS', 160, 5), 
('item1004', 'カフェラテ', 160, 5), 
('item1005', 'クリスタルガイザー', 120, 5), 
('item1006', 'ミネラルウォーター', 120, 5), 
('item1007', 'RedBull', 190, 5), 
('item1008', 'デカビタ', 130, 5);

mysql> INSERT INTO drinkitem_t VALUES
    -> ('item1001', '綾鷹', 150, 5),
    -> ('item1002', '伊藤園', 150, 5),
    -> ('item1003', 'クラフトBOSS', 160, 5),
    -> ('item1004', 'カフェラテ', 160, 5),
    -> ('item1005', 'クリスタルガイザー', 120, 5),
    -> ('item1006', 'ミネラルウォーター', 120, 5),
    -> ('item1007', 'RedBull', 190, 5),
    -> ('item1008', 'デカビタ', 130, 5);
Query OK, 8 rows affected (0.00 sec)
Records: 8  Duplicates: 0  Warnings: 0


要素の表示
SELECT * FROM drinkitem_t;

mysql> SELECT * FROM drinkitem_t;
+----------+--------------------+-------------+-------------+
| ITEMID_C | ITEMNAME_C         | ITEMPRICE_C | INVENTORY_C |
+----------+--------------------+-------------+-------------+
| item1001 | 綾鷹               |         150 |           5 |
| item1002 | 伊藤園             |         150 |           5 |
| item1003 | クラフトBOSS       |         160 |           5 |
| item1004 | カフェラテ         |         160 |           5 |
| item1005 | クリスタルガイザー |         120 |           5 |
| item1006 | ミネラルウォーター |         120 |           5 |
| item1007 | RedBull            |         190 |           5 |
| item1008 | デカビタ           |         130 |           5 |
+----------+--------------------+-------------+-------------+
8 rows in set (0.00 sec)


カラムの追加

ALTER TABLE <テーブル名> ADD COLUMN <追加するカラム名> <追加するカラムの型>;

自動販売機のボタンカラムを追加したい
ALTER TABLE drinkitem_t ADD COLUMN VENDERBUTTON_C INT;

mysql> SHOW COLUMNS FROM drinkitem_t;
+----------------+-------------+------+-----+---------+-------+
| Field          | Type        | Null | Key | Default | Extra |
+----------------+-------------+------+-----+---------+-------+
| ITEMID_C       | char(16)    | NO   | PRI | NULL    |       |
| ITEMNAME_C     | varchar(32) | NO   |     | NULL    |       |
| ITEMPRICE_C    | int         | NO   |     | NULL    |       |
| INVENTORY_C    | int         | NO   |     | NULL    |       |
| VENDERBUTTON_C | int         | YES  |     | NULL    |       |
+----------------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)


DESCRIBE drinkitem_t;
mysql> DESCRIBE drinkitem_t;
+----------------+-------------+------+-----+---------+-------+
| Field          | Type        | Null | Key | Default | Extra |
+----------------+-------------+------+-----+---------+-------+
| ITEMID_C       | char(16)    | NO   | PRI | NULL    |       |
| ITEMNAME_C     | varchar(32) | NO   |     | NULL    |       |
| ITEMPRICE_C    | int         | NO   |     | NULL    |       |
| INVENTORY_C    | int         | NO   |     | NULL    |       |
| VENDERBUTTON_C | int         | YES  |     | NULL    |       |
+----------------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

ALTER TABLE drinkitem_t CHANGE COLUMN VENDERBUTTON_C BUTTON_C INT;
mysql> DESCRIBE drinkitem_t;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| ITEMID_C    | char(16)    | NO   | PRI | NULL    |       |
| ITEMNAME_C  | varchar(32) | NO   |     | NULL    |       |
| ITEMPRICE_C | int         | NO   |     | NULL    |       |
| INVENTORY_C | int         | NO   |     | NULL    |       |
| BUTTON_C    | int         | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

SELECT * FROM drinkitem_t;
mysql> SELECT * FROM drinkitem_t;
+----------+--------------------+-------------+-------------+----------+
| ITEMID_C | ITEMNAME_C         | ITEMPRICE_C | INVENTORY_C | BUTTON_C |
+----------+--------------------+-------------+-------------+----------+
| item1001 | 綾鷹               |         150 |           5 |     NULL |
| item1002 | 伊藤園             |         150 |           5 |     NULL |
| item1003 | クラフトBOSS       |         160 |           5 |     NULL |
| item1004 | カフェラテ         |         160 |           5 |     NULL |
| item1005 | クリスタルガイザー |         120 |           5 |     NULL |
| item1006 | ミネラルウォーター |         120 |           5 |     NULL |
| item1007 | RedBull            |         190 |           5 |     NULL |
| item1008 | デカビタ           |         130 |           5 |     NULL |
+----------+--------------------+-------------+-------------+----------+
8 rows in set (0.00 sec)

ALTER TABLE drinkitem_t DROP COLUMN BUTTON_C;
mysql> ALTER TABLE drinkitem_t DROP COLUMN BUTTON_C;
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM drinkitem_t;
+----------+--------------------+-------------+-------------+
| ITEMID_C | ITEMNAME_C         | ITEMPRICE_C | INVENTORY_C |
+----------+--------------------+-------------+-------------+
| item1001 | 綾鷹               |         150 |           5 |
| item1002 | 伊藤園             |         150 |           5 |
| item1003 | クラフトBOSS       |         160 |           5 |
| item1004 | カフェラテ         |         160 |           5 |
| item1005 | クリスタルガイザー |         120 |           5 |
| item1006 | ミネラルウォーター |         120 |           5 |
| item1007 | RedBull            |         190 |           5 |
| item1008 | デカビタ           |         130 |           5 |
+----------+--------------------+-------------+-------------+
8 rows in set (0.00 sec)

ALTER TABLE drinkitem_t CHANGE COLUMN ITEMID_C BUTTON_C CHAR(16);
mysql> ALTER TABLE drinkitem_t CHANGE COLUMN ITEMID_C BUTTON_C CHAR(16);
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM drinkitem_t;
+----------+--------------------+-------------+-------------+
| BUTTON_C | ITEMNAME_C         | ITEMPRICE_C | INVENTORY_C |
+----------+--------------------+-------------+-------------+
| item1001 | 綾鷹               |         150 |           5 |
| item1002 | 伊藤園             |         150 |           5 |
| item1003 | クラフトBOSS       |         160 |           5 |
| item1004 | カフェラテ         |         160 |           5 |
| item1005 | クリスタルガイザー |         120 |           5 |
| item1006 | ミネラルウォーター |         120 |           5 |
| item1007 | RedBull            |         190 |           5 |
| item1008 | デカビタ           |         130 |           5 |
+----------+--------------------+-------------+-------------+
8 rows in set (0.00 sec)

BUTTON_C に自動販売機のボタン操作に対応した数字をもたせる 1～8


*/
		
		
		//並んでいる商品のオブジェクト化
		//改変予定：引数を自分で入力できるようにしたい
		Hot tea1			= new Hot("綾鷹", 150);
		Hot tea2			= new Hot("伊藤園", 150);
		Hot coffee1			= new Hot("クラフトBOSS", 160);
		Hot coffee2			= new Hot("カフェラテ  ", 160);
		Cold water1			= new Cold("クリスタルガイザー", 120);
		Cold water2			= new Cold("ミネラルウォーター", 120);
		Cold energyDrink1	= new Cold("RedBull", 190);
		Cold energyDrink2	= new Cold("デカビタ", 130);
		
		//Drinkクラスの配列に全てのオブジェクトを格納
		Drink[] drinks = new Drink[8];
		drinks[0] = tea1;
		drinks[1] = tea2;
		drinks[2] = coffee1;
		drinks[3] = coffee2;
		drinks[4] = energyDrink1;
		drinks[5] = energyDrink2;
		drinks[6] = water1;
		drinks[7] = water2;


		//自販機クラスへ商品オブジェクト群を渡す
		vender.showItemList(drinks);
		//終了時刻の記録
		vender.checkEnd();
		//終了時刻-起動時刻=稼働時間の表示
		vender.showTime();
		
		
		System.out.println("\n\n\nshutdown vender");
	}
}

//------------------------------------------------------------------------------------------

class Vender {//自販機クラス
	//ボタンに対応した整数型の変数
	int venderNumber;
	//主電源　継続動作用に定義
	boolean venderPower = true;
	//稼働継続チェック用
	int powerCheck;
	//稼働していた時間
	private long operation;
	//起動時間保持用
	private long before;
	//終了時間保持用
	private long after;

	//改変予定：BufferReaderに変える
	Scanner scanner = new Scanner(System.in);
	//受け取るためのObject型配列
	Drink[] drinks = new Drink[8];//お茶、水、コーヒー、redbullそれぞれ2個ずつ

	//Drink型のオブジェクト群を受け取る
	public void showItemList(Drink[] drinks) {
		//支払処理に飛ぶのでインスタンス化
		Purchase purchase = new Purchase();

		this.drinks = drinks;
		//trueの間は稼働し続ける
		while(venderPower) {
			System.out.println("商品一覧\n購入する番号を選択してください(有効範囲：1～8)\n");
			//配列の要素数まで繰り返して表示する
			for(int i = 0 ; i < drinks.length ; i++) {
				//改変予定：文字列の整頓する
				System.out.println( (i + 1) + "：" + drinks[i].getDrinkName() + "\t\t" + drinks[i].getDrinkPrice() + "円\t" + drinks[i].getState());
			}
			//要素数の範囲で入力を受け付ける
			for(int i = 0 ; i < 1 ; i++) {
				//i + 1された値を見て入力しているのでマイナスする
				venderNumber = scanner.nextInt() - 1;
				
				//System.out.println(venderNumber);//-1　ちゃんと代入出来ているかの確認用
				if( venderNumber > -1 && venderNumber < drinks.length ) {
					//支払い処理メソッドの呼び出し
					purchase.choseDrink(venderNumber,drinks);
				}
				else {
					System.out.println("\n入力エラー\n1～" + drinks.length + "の番号を入力してください。");
					i--;
				}
			}
			//継続確認メソッドを呼び出し
			continueCheck();
		}
	}

	public void continueCheck() {
		System.out.println("\n\n\n\nプログラムを継続しますか？\n継続する場合は1を、終了する場合は2を入力してください");
			powerCheck = scanner.nextInt();

			switch(powerCheck) {
				case 1:
					//フィールドに代入
					venderPower = true;
					break;
				case 2:
					//主電源をオフにする
					venderPower = false;
					break;
				default ://1,2以外を入力した場合の処理
					System.out.println("異常な入力を検知。プログラム終了を回避しました。");
					venderPower = true;
					break;
			}
		}
	//開始時刻記録メソッド
	public void checkStart() {
		before = System.currentTimeMillis();
	}
	//終了時刻記録メソッド
	public void checkEnd() {
		after = System.currentTimeMillis();
	}
	//稼働時間表示メソッド
	public void showTime() {
		operation = after - before;
		
		System.out.println("稼働時間:" + operation + "ms");
	}
}

//------------------------------------------------------------------------------------------

class Purchase {//商品選択から支払処理まで

	private int sellingPrice;		//販売する金額
	private int change;				//お釣り
	private int paymentMoney;		//支払われる金額
	private int insufficientMoney;	//不足額
	private int addMoney;			//追加支払い
	
	//疑問：配列の要素数決定を引数で出来ないのか
	Drink[] drinks = new Drink[8];
	Scanner scanner = new Scanner(System.in);

	public void choseDrink(int venderNumber, Drink[] drinks) {
		this.drinks = drinks;

		//選択された番号とiが等しい場合、販売金額を設定する
		for(int i = 0 ; i < drinks.length ; i++) {
			//入力した数字と対応する商品の価格を取得
			if(i == venderNumber) {
				//販売価格へ代入
				sellingPrice = drinks[i].getDrinkPrice();
				//支払処理メソッド呼び出し
				payment(i);
				//在庫減少メソッドを呼び出し
				drinks[i].reduceInventory();
			}
		}
	}
	
	public void payment(int venderNumber) {
		//入力した数字を添え字として、名前と価格を持ってくる
		System.out.println(drinks[venderNumber].getDrinkName() + "の購入\n" + drinks[venderNumber].getDrinkPrice() + "円を投入してください。");
		
		System.out.println("\n投入金額を入力");
		//支払額に入力
		paymentMoney = scanner.nextInt();
		//支払額が販売額と同じか大きい場合
		if(paymentMoney >= sellingPrice) {
			//おつりの算出
			change = paymentMoney - sellingPrice;
		}
		//支払額が不足している場合
		else if(!(paymentMoney >= sellingPrice)) {
			//不足額に差額を代入
			insufficientMoney = sellingPrice - paymentMoney;
				//無限ループ　whileでも可
				for(int i = 0 ; i < 1 ; i++) {
					//差額から追加支払いを引く　初回は-0なので変化なし　2周目から
					insufficientMoney -= addMoney;
					//差額が0以上の場合
					if(insufficientMoney > 0) {
						System.out.println("金額が不足しています。残り" + insufficientMoney + "円の不足。\n不足分を投入してください。");
						//iをデクリメントすることで i < 1を満たし続ける
						i--;
						//追加支払額を入力
						addMoney = scanner.nextInt();
					}
					//差額が0未満になった場合(追加支払いで差額が＋に転じた場合)
					else if(insufficientMoney < 0) {
						//お釣りに反転して代入
						change = -insufficientMoney;
					}
				}
		}
		System.out.println("お釣りは" + change + "円です。");
	}
}

//------------------------------------------------------------------------------------------

//継承元抽象クラス
abstract class Drink {
	String drinkName;
	int drinkPrice;
	//初期の在庫は5個 5個以下になったら補充する
	int inventory = 5;
	//補充は5個で仮定
	int refill = 5;

	//在庫減少メソッド
	protected void reduceInventory() {
		inventory -= 1;

		System.out.println("\n\n--------------------------------------------------------------------------------");
		System.out.println("業者向け情報\n" + this.drinkName + "の残在庫数：" + inventory);

		if( inventory < 5 ) {
			System.out.println("在庫が少なくなっています。補充してください");
			System.out.println(">>>>補充処理。");
			
			refillDrink();
			
			System.out.println(">>>>補充終了。");
		}
		System.out.println("--------------------------------------------------------------------------------\n\n");
	}
	
	//補充メソッド
	protected void refillDrink() {
		//在庫に補充を加算
		inventory += refill;
		
		System.out.println(refill + "個を補充しました。\n現在の在庫数は" + inventory + "個です。");
	}


	protected void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	protected void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	
	//getメソッドはオーバーライドが必要(オーバーライドをしてみたかっただけ)
	protected abstract String getDrinkName();
	protected abstract int getDrinkPrice();
	protected abstract int getInventory();
	protected abstract String getState();
}

//------------------------------------------------------------------------------------------

class Hot extends Drink {
	String state = "hot";
	
	public Hot(String drinkName, int drinkPrice) {
		this.drinkName	= drinkName;
		this.drinkPrice	= drinkPrice;
	}

	public String getDrinkName() {
		return drinkName;
	}
	public int getDrinkPrice() {
		return drinkPrice;
	}
	public int getInventory() {
		return inventory;
	}
	public String getState() {
		return state;
	}
}

//------------------------------------------------------------------------------------------

class Cold extends Drink {
	String state = "cold";
	
	public Cold(String drinkName, int drinkPrice) {
		this.drinkName	= drinkName;
		this.drinkPrice	= drinkPrice;
	}

	public String getDrinkName() {
		return drinkName;
	}
	public int getDrinkPrice() {
		return drinkPrice;
	}
	public int getInventory() {
		return inventory;
	}
	public String getState() {
		return state;
	}
}
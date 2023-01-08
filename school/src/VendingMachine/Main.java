package VendingMachine;

import java.util.Scanner;

//購入中止を想定していない
public class Main {
	public static void main(String[] args) {//選択番号の条件分岐追加 switch文をfor文へ 短縮
		
		//処理時間計測インスタンス
		TimeCheck timer = new TimeCheck();
		
		timer.checkStart();
		
		ContinueChecker continueChecker = new ContinueChecker();
		//BufferReaderに変更する
		Scanner scanner = new Scanner(System.in);
		//並んでいる商品のオブジェクト化
		//引数を自分で入力できるようにしたい
		Tea tea1					= new Tea("綾鷹", 150);
		Tea tea2					= new Tea("伊藤園", 150);
		Coffee coffee1				= new Coffee("クラフトBOSS", 160);
		Coffee coffee2				= new Coffee("カフェラテ  ", 160);
		Water water1				= new Water("クリスタルガイザー", 120);
		Water water2				= new Water("ミネラルウォーター", 120);
		EnergyDrink energyDrink1	= new EnergyDrink("RedBull", 190);
		EnergyDrink energyDrink2	= new EnergyDrink("デカビタ", 130);

		//主電源
		boolean venderPower = true;
		
		System.out.println("launch vender\n\n\n");
		
		while(venderPower) {
		//自販機クラスへ商品オブジェクトを渡す
		Vender vender	= new Vender();
		vender.showItemList(tea1, tea2, coffee1, coffee2, water1, water2, energyDrink1, energyDrink2);

		venderPower = continueChecker.continueCheck();
		}
		
		scanner.close();
		
		timer.checkEnd();
		timer.showTime();
		System.out.println("\n\n\nshutdown vender");
	}
}
/*
C:\vender20221116\vender01\Vender>java Main
launch vender



商品一覧
購入する番号を選択してください(有効範囲：1～8)

1：綾鷹         150円
2：伊藤園               150円
3：クラフトBOSS         160円
4：カフェラテ           160円
5：クリスタルガイザー           120円
6：ミネラルウォーター           120円
7：RedBull              190円
8：デカビタ             130円
1
綾鷹の購入
150円を投入してください。

投入金額を入力
1000
お釣りは850円です。


--------------------------------------------------------------------------------
業者向け情報
綾鷹の残在庫数：2
在庫が少なくなっています。補充してください
>>>>補充処理。
5個を補充しました。
現在の在庫数は7個です。
>>>>補充終了。
--------------------------------------------------------------------------------






プログラムを継続しますか？
継続する場合は1を、終了する場合は2を入力してください
1
商品一覧
購入する番号を選択してください(有効範囲：1～8)

1：綾鷹         150円
2：伊藤園               150円
3：クラフトBOSS         160円
4：カフェラテ           160円
5：クリスタルガイザー           120円
6：ミネラルウォーター           120円
7：RedBull              190円
8：デカビタ             130円
1
綾鷹の購入
150円を投入してください。

投入金額を入力
100
金額が不足しています。残り50円の不足。
不足分を投入してください。
10
金額が不足しています。残り40円の不足。
不足分を投入してください。
10
金額が不足しています。残り30円の不足。
不足分を投入してください。
10
金額が不足しています。残り20円の不足。
不足分を投入してください。
10
金額が不足しています。残り10円の不足。
不足分を投入してください。
10
お釣りは0円です。


--------------------------------------------------------------------------------
業者向け情報
綾鷹の残在庫数：6
--------------------------------------------------------------------------------






プログラムを継続しますか？
継続する場合は1を、終了する場合は2を入力してください
2


稼働時間:23874ms
shutdown vender

C:\vender20221116\vender01\Vender>
*/
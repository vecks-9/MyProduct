package VendingMachine;

import java.util.Scanner;

class Vender {//自販機クラス
	int venderNumber;

	Item[] items = new Item[8];//お茶、水、コーヒー、redbullそれぞれ2個ずつ

	//Item型のオブジェクト群を受け取る
	public void showItemList(Item tea1, Item tea2, Item coffee1, Item coffee2, Item energyDrink1, Item energyDrink2, Item water1, Item water2) {
		Scanner scanner = new Scanner(System.in);
		Purchase purchase = new Purchase();

		items[0] = tea1;
		items[1] = tea2;
		items[2] = coffee1;
		items[3] = coffee2;
		items[4] = energyDrink1;
		items[5] = energyDrink2;
		items[6] = water1;
		items[7] = water2;


		System.out.println("商品一覧\n購入する番号を選択してください(有効範囲：1～8)\n");
		for(int i = 0 ; i < items.length ; i++) {
			System.out.println( (i + 1) + "：" + items[i].getItemName() + "\t\t" + items[i].getItemPrice() + "円");
		}
		//1-8だけ入力を受け付ける
		for(int i = 0 ; i < 1 ; i++) {
			//i + 1された値を見て入力しているので1ずれるからマイナスする
			venderNumber = scanner.nextInt() - 1;
			
//			System.out.println(venderNumber);//-1ちゃんと出来ているかの確認用
			if( venderNumber > -1 && venderNumber < 8 ) {
				purchase.choseItem(venderNumber,items);
			}
			else {
				System.out.println("\n入力エラー\n1～8の番号を入力してください。");
				i--;
			}
		}
	}
	
}

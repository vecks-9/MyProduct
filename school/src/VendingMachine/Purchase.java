package VendingMachine;

import java.util.Scanner;

class Purchase {//商品選択から支払処理まで

	int sellingPrice;		//販売する金額
	int change;				//お釣り
	int paymentMoney;		//支払われる金額
	int venderNumber;		//自販機の表示から選択された番号
	int insufficientMoney;	//不足額
	int addMoney;			//追加支払い
	
	Item[] items = new Item[8];
	Scanner scanner = new Scanner(System.in);

	public void choseItem(int venderNumber, Item[] items) {
		this.items = items;
		this.venderNumber = venderNumber;

		//選択された番号とiが等しい場合、販売金額を設定する
		for(int i = 0 ; i < items.length ; i++) {
			if(i == venderNumber) {
				sellingPrice = items[i].getItemPrice();
				payment(i);
				items[i].reduceInventory();
			}
		}
	}
	public void payment(int venderNumber) {
	
		System.out.println(items[venderNumber].getItemName() + "の購入\n" + items[venderNumber].getItemPrice() + "円を投入してください。");
		
		System.out.println("\n投入金額を入力");
		paymentMoney = scanner.nextInt();

		if(paymentMoney >= sellingPrice) {
			change = paymentMoney - sellingPrice;
		}

		else if(!(paymentMoney >= sellingPrice)) {
			insufficientMoney = sellingPrice - paymentMoney;
				for(int i = 0 ; i < 1 ; i++) {
					insufficientMoney -= addMoney;
					
					if(insufficientMoney > 0) {
						System.out.println("金額が不足しています。残り" + insufficientMoney + "円の不足。\n不足分を投入してください。");
						i--;
						addMoney = scanner.nextInt();
					}
					else if(insufficientMoney < 0) {
						change += -insufficientMoney;
					}
				}
		}
		
		System.out.println("お釣りは" + change + "円です。");
	}
}

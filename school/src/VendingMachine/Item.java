package VendingMachine;

abstract class Item {//アイテムクラスは名前と価格と在庫を保持する
	String itemName;
	int itemPrice;
	//初期の在庫は3個 5個以下になったら補充する
	int inventory = 3;
	//補充は5個で仮定
	int refill = 5;


	protected void reduceInventory() {
		inventory -= 1;

		System.out.println("\n\n--------------------------------------------------------------------------------");
		System.out.println("業者向け情報\n" + this.itemName + "の残在庫数：" + inventory);

		if( inventory < 5 ) {
			System.out.println("在庫が少なくなっています。補充してください");
			System.out.println(">>>>補充処理。");
			
			refillItem();
			
			System.out.println(">>>>補充終了。");
		}
		System.out.println("--------------------------------------------------------------------------------\n\n");

	}
	//補充メソッド
	protected void refillItem() {
		inventory += refill;
		
		System.out.println(refill + "個を補充しました。\n現在の在庫数は" + inventory + "個です。");
	}


	protected void setItemName(String itemName) {
		this.itemName = itemName;
	}
	protected void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	protected abstract String getItemName();
	protected abstract int getItemPrice();
	protected abstract int getInventory();

}

public class Constructor{//コンストラクタ出題
    public static void main(String[] args){
        Item i1 = new Item("コーヒー", 120);
        Item i2 = new Item("オレンジジュース", 150);

        i1.display();
        i2.display();
    }
}

class Item {
	String itemName;
	int itemPrice;
	
	public Item(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public String getItemName() {
		return itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}

	public void display() {
		System.out.println(itemName + ":" + itemPrice + "円");
	}

}
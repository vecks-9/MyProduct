package VendingMachine;

class Coffee extends Item {
	public Coffee(String itemName, int itemPrice) {
		this.itemName	= itemName;
		this.itemPrice	= itemPrice;
	}

	public String getItemName() {
		return itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public int getInventory() {
		return inventory;
	}
}

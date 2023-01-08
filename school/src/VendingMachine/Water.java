package VendingMachine;

class Water extends Item {
	public Water(String itemName, int itemPrice) {
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

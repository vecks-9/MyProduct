package VendingMachine;

class EnergyDrink extends Item {
	public EnergyDrink(String itemName, int itemPrice) {
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


public class Constructor2 {
    public static void main(String[] args) {
        Shop s1 = new Shop("A町店", 150000);
        Shop s2 = new Shop("B公園前店", 180000);
        Shop s3 = new Shop();

        s1.display();
        s2.display();
        s3.display();
    }
}

class Shop {
	String shopName;
	int shopSales;
	
	//引数別コンストラクタ
	public Shop(String shopName,int shopSales) {
		this.shopName = shopName;
		this.shopSales = shopSales;
	}
//文字列のみ記入することで発生するエラー回避用コンストラクタ
/*	public Shop(String shopName) {
		this.shopName = shopName;
		this.shopSales = 0;
	}*/
	public Shop() {
		this.shopName = "出店予定";
	}
	//setter
	public void setShopName() {
		
	}
	public void setShopSales() {
		
	}
	//getter
	public String getShopName() {
		return shopName;
	}
	public int getShopSales() {
		return shopSales;
	}
	//出力
	public void display() {
		System.out.println(shopName + ":売上高 " + shopSales + "円");
	}
}
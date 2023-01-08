
public class Constructor3 {
	public static void main(String[] args) {
		Daikei dikei1 = new Daikei(12,8,5);
		Daikei dikei2 = new Daikei(8,4,10);
		
		dikei1.getMenseki();
		dikei2.getMenseki();
	}
}

class Daikei {
	private int upper;
	private int lower;
	private int high;
	private int menseki;
	
	public Daikei(int upper,int lower,int high) {
		this.upper = upper;
		this.lower = lower;
		this.high = high;
	}
	public void setUpper(int upper) {
		this.upper = upper;
	}
	public void setLower(int lower) {
		this.lower = lower;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	
	public int getUpper() {
		return upper;
	}
	public int getLower() {
		return lower;
	}
	public int getHigh() {
		return high;
	}

	public void calc() {

		menseki = ((upper + lower) * high) / 2;
	}

	public void getMenseki() {
		calc();
		
		System.out.println(menseki);
	}
	
}
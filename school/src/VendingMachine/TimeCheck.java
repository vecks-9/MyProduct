package VendingMachine;

class TimeCheck {
	private long needTime;
	private long before;
	private long after;

	public void checkStart() {
		before = System.currentTimeMillis();
	}
		
	public void checkEnd() {
		after = System.currentTimeMillis();
	}

	public void showTime() {
		needTime = after - before;
		
		System.out.println("稼働時間:" + needTime + "ms");
	}
}

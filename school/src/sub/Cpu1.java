package sub;

import java.util.Random;

public class Cpu1 {
	private String cpu1Name = null;//Dell
	private String cpu1Hand = null;//"グー"、"チョキ"、"パー"
	
	public Cpu1 (String cpuName, String cpuHand) {
		this.cpu1Name = cpuName;
		this.cpu1Hand = cpuHand;
	}
/*	public Cpu1 (String cpuName) {
		this(cpu1Name,"");
	}*/
	
	public String make1CpuHand() {
		Random random = new Random();
	
		int int1Hand = random.nextInt(3);
		
		switch(int1Hand) {
			case 0:
				cpu1Hand = "グー";
				break;
			case 1:
				cpu1Hand = "チョキ";
				break;
			case 2:
				cpu1Hand = "パー";
				break;
		}
		return cpu1Hand;
	}
	public String getCpu1Name() {
		return cpu1Name;
	}
	
	public String getCpu1Hand() {
		return cpu1Hand;
	}
}

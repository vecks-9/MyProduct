package sub;

import java.util.Random;

public class Cpu2 {
	private String cpu2Name = null;//Dell
	private String cpu2Hand = null;//"グー"、"チョキ"、"パー"
	
	public Cpu2 (String cpuName, String cpuHand) {
		this.cpu2Name = cpuName;
		this.cpu2Hand = cpuHand;
	}

	public String make2CpuHand() {
		Random random = new Random();
	
		int int2Hand = random.nextInt(3);
		
		switch(int2Hand) {
			case 0:
				cpu2Hand = "グー";
				break;
			case 1:
				cpu2Hand = "チョキ";
				break;
			case 2:
				cpu2Hand = "パー";
				break;
		}
		return cpu2Hand;
	}
	public String getCpu2Name() {
		return cpu2Name;
	}
	
	public String getCpu2Hand() {
		return cpu2Hand;
	}
}

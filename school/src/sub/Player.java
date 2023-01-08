package sub;

import java.util.Scanner;

public class Player {
	private String name = null;//Player
	private String hand = null;//"グー"、"チョキ"、"パー"
	
	public Player (String name, String hand) {
		this.name = name;
		this.hand = hand;
	}
	public Player (String name) {
		this(name,"");
	}
	
	public String makeHand() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("「グー」「チョキ」「パー」のいずれかを入力してください > ");
		hand = scanner.nextLine();
	
		return hand;
	}

	public String getName() {
		return name;
	}
	public String getHand() {
		return hand;
	}
}

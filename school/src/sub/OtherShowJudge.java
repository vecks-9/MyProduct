package sub;

public class OtherShowJudge {//勝敗判定クラス
	private String cycle = "";
	private String cpu1Name;
	private String cpu2Name;
	private String name;
	private String cpu1Hand;
	private String cpu2Hand;
	private String hand;
	private String errorMsg = "error";
	
	public String judgeGame(String cpu1Name, String cpu1Hand, String cpu2Name, String cpu2Hand, String name, String hand) {
//	public String judgeGame(Cpu1 cpu1, Cpu2 cpu2, Player player) {
		if(!(cpu1Hand.equals(cpu2Hand))&&!(cpu2Hand.equals(hand))&&!(hand.equals(cpu1Hand))||//全員が異なる
		(cpu1Hand.equals(cpu2Hand))&&(cpu2Hand.equals(hand))&&(hand.equals(cpu1Hand))) {//全員が同じ

			cycle = "あいこ";
			
			return cycle;
		}
		else {//あいこ以外 2人勝ちから判定
			if(cpu1Hand.equals("グー")&&cpu2Hand.equals("グー")) {//2人が勝つ
				if(hand.equals("チョキ")) {
					cycle = cpu1Hand + "で" + cpu1Name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(hand.equals("パー")) {
					cycle = hand + "で" + name + "の一人勝ち";
					return cycle;
				}
			}
			else if(cpu1Hand.equals("チョキ")&&cpu2Hand.equals("チョキ")) {
				if(hand.equals("パー")) {
					cycle = cpu1Hand + "で" + cpu1Name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(hand.equals("グー")) {
					cycle = hand + "で" + name + "の一人勝ち";
					return cycle;
				}
			}
			else if(cpu1Hand.equals("パー")&&cpu2Hand.equals("パー")) {
				if(hand.equals("グー")) {
					cycle = cpu1Hand + "で" + cpu1Name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(hand.equals("チョキ")) {
					cycle = hand + "で" + name + "の一人勝ち";
					return cycle;
				}
			}
			else if(hand.equals("グー")&&cpu1Hand.equals("グー")) {
				if(cpu2Hand.equals("チョキ")) {
					cycle = hand + "で" + name + "と" + cpu1Name + "の勝ち";
					return cycle;
				}
				else if(cpu2Hand.equals("パー")) {
					cycle = cpu2Hand + "で" + cpu2Name + "の一人勝ち";
					return cycle;
				}
			}
			else if(hand.equals("チョキ")&&cpu1Hand.equals("チョキ")) {
				if(cpu2Hand.equals("パー")) {
					cycle = hand + "で" + name + "と" + cpu1Name + "の勝ち";
					return cycle;
				}
				else if(cpu2Hand.equals("グー")) {
					cycle = cpu2Hand + "で" + cpu2Name + "の一人勝ち";
					return cycle;
				}
			}
			else if(hand.equals("パー")&&cpu1Hand.equals("パー")) {
				if(cpu2Hand.equals("グー")) {
					cycle = hand + "で" + name + "と" + cpu1Name + "の勝ち";
					return cycle;
				}
				else if(cpu2Hand.equals("チョキ")) {
					cycle = cpu2Hand + "で" + cpu2Name + "の一人勝ち";
					return cycle;
				}
			}

			else if(hand.equals("グー")&&cpu2Hand.equals("グー")) {
				if(cpu1Hand.equals("チョキ")) {
					cycle = hand + "で" + name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(cpu1Hand.equals("パー")) {
					cycle = cpu1Hand + "で" + cpu1Name + "の一人勝ち";
					return cycle;
				}
			}
			else if(hand.equals("チョキ")&&cpu2Hand.equals("チョキ")) {
				if(cpu1Hand.equals("パー")) {
					cycle = hand + "で" + name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(cpu1Hand.equals("グー")) {
					cycle = cpu1Hand + "で" + cpu1Name + "の一人勝ち";
					return cycle;
				}
			}
			else if(hand.equals("パー")&&cpu2Hand.equals("パー")) {
				if(cpu1Hand.equals("グー")) {
					cycle = hand + "で" + name + "と" + cpu2Name + "の勝ち";
					return cycle;
				}
				else if(cpu1Hand.equals("チョキ")) {
					cycle = cpu1Hand + "で" + cpu1Name + "の一人勝ち";
					return cycle;
				}
			}
			
		}
		return errorMsg;
	}
}
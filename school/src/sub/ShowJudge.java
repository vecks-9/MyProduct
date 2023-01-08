package sub;

public class ShowJudge {//勝敗判定クラス
	private String cycle = "";
/*	private String cpu1Name;
	private String cpu2Name;
	private String name;
	private String cpu1Hand;
	private String cpu2Hand;
	private String hand;*/
	private String errorMsg = "error";
	
	public String judgeGame(String cpu1Name, String cpu1Hand, String cpu2Name, String cpu2Hand, String name, String hand) {
//		if(cpu1Hand.equals(hand)||cpu1Hand.equals(cpu2Hand)||cpu2Hand.equals(hand)){
		if(cpu1Hand.equals(hand)||cpu1Hand.equals(cpu2Hand)||cpu2Hand.equals(hand)||!(cpu1Hand.equals(cpu2Hand))&&!(cpu2Hand.equals(hand))&&!(hand.equals(cpu1Hand))) {
			cycle = "あいこ";
			
			return cycle;
		}
		else {
			if(cpu1Hand.equals("グー")) {
				if((hand.equals("チョキ"))&&(cpu2Hand.equals("チョキ"))) {
					cycle = cpu1Name + "の勝ち";
					return cycle;
				}
				else if((hand.equals("パー"))&&(cpu2Hand.equals("グー"))) {
					cycle = name + "の勝ち";
					return cycle;
				}
				else if((cpu2Hand.equals("パー"))&&(hand.equals("グー"))) {
					cycle = cpu2Hand + "の勝ち";
					return cycle;
				}
			}
			else if(cpu1Hand.equals("チョキ")) {
				if(hand.equals("パー")) {
					cycle = cpu1Name + "の勝ち";
					return cycle;
				}
				else if(hand.equals("グー")) {
					cycle = name + "の勝ち";
					return cycle;
				}
			}
			else if(cpu1Hand.equals("パー")) {
				if(hand.equals("グー")) {
					cycle = cpu1Name + "の勝ち";
					return cycle;
				}
				else if(hand.equals("チョキ")) {
					cycle = name + "の勝ち";
					return cycle;
				}
			}
		}
		return errorMsg;
	}
}

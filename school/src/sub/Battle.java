package sub;

public class Battle {
	private String cpu1Name;
	private String cpu2Name;
	private String name;
	private String cpu1Hand;
	private String cpu2Hand;
	private String hand;
	private String judgeMsg;
	
	public void battleGame(Cpu1 cpu1, Cpu2 cpu2, Player player) {
//		ShowJudge showJudge = new ShowJudge();
		OtherShowJudge showJudge = new OtherShowJudge();

		cpu1Name = cpu1.getCpu1Name();
		cpu2Name = cpu2.getCpu2Name();
		name = player.getName();
		
		System.out.println("[" + name + "]と[" + cpu1Name + "]と[" + cpu2Name + "]の対戦\n");
		
		for(int i = 0 ; i < 1 ; i++) {
			cpu1Hand = cpu1.make1CpuHand();
			cpu2Hand = cpu2.make2CpuHand();
			for(int j = 0 ; j < 1 ; j++){
				hand = player.makeHand();
				
				if(hand.equals("グー")){
				//プレイヤーの入力判定 処理なし
				}
				else if(hand.equals("チョキ")){
				//プレイヤーの入力判定 処理なし
				}
				else if(hand.equals("パー")){
				//プレイヤーの入力判定 処理なし
				}
				else {
					System.out.println("\n\n不正な入力を検知しました。\n\n「グー」「チョキ」「パー」以外の入力は無効です。\n\n");
					
					j--;
				}				
			}
			
			System.out.print("\n<" + name + ">:" + hand);
			System.out.println("\t<" + cpu1Name + ">:" + cpu1Hand);
			System.out.println("\t<" + cpu2Name + ">:" + cpu2Hand + "\n");
			judgeMsg = showJudge.judgeGame(cpu1Name, cpu1Hand, cpu2Name, cpu2Hand, name, hand);

			if(judgeMsg.equals("あいこ")) {
				System.out.println("あいこ　もう1回");
				//iをデクリメントするので無限ループ
				i--;
			}
			else {
				System.out.println(judgeMsg);
			}
		}

	}
}

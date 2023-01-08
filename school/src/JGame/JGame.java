package JGame;

import sub.Battle;
import sub.Cpu1;
import sub.Cpu2;
import sub.Player;

public class JGame {
	public static void main(String[] args) {//Cpu VS Player
		System.out.println("じゃんけんゲーム\n");
		
		Cpu1 cpu1 = new Cpu1("Java","");
		Cpu2 cpu2 = new Cpu2("Dell","");
		Player player = new Player("Player","");
		
		Battle battle = new Battle();
		battle.battleGame(cpu1,cpu2,player);
		
	}
}
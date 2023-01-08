package HitAndBlow;
//判定クラス
public class JudgeNumber {
	//引数に問題と回答の4桁の数字配列を受け取る
	public int judgeNumber(int[] answers,int[] problems) {
		//hitとblowは毎回初期化する
		int hit		= 0;
		int blow	= 0;

		//以下判定
		for(int i = 0 ; i < problems.length ; i++) {
			//同じ場所に同じ数字が入っていればhit
			if( answers[i] == problems[i] ) {
				System.out.println("\n" + ( i + 1 ) + "番目は正解です");
				hit += 1;
			}
			
			else {//blowかどうかの判定 forループで総当たり
				for(int j = 0 ; j < problems.length ; j++) {
					if( answers[i] == problems[j] ) {
						System.out.println("\nおしい！" + answers[i] + "は答えに含まれます");
						blow += 1;
					}
				}
			}
			
		}
		System.out.println("hit:" + hit + "\tblow:" + blow);
		return hit;
	}
}
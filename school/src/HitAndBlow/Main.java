package HitAndBlow;

public class Main {
	public static void main(String[] args) {
		System.out.println("hit and blow\n");
		//入力生成クラス
		EnterNumbers enterNumbers		= new EnterNumbers();
		//乱数生成クラス
		MakeRandomNumbers numberMaker	= new MakeRandomNumbers();
		//合致判定クラス
		JudgeNumber judgeNumber			= new JudgeNumber();
		//問題用配列を準備 生成した乱数の配列を戻り値として代入する
		int[] problems	= numberMaker.makeRandomNumbers();
		//while文を抜ける判定材料として宣言 配列の長さ for文に利用する
		int count = problems.length;
		//while文が無限ループするようにtrueを代入
		boolean success = true;
		
		while(success) {
			//入力する回答配列に入力受付クラスから配列を戻り値として受けとる
			/*1文字ごとの入力用
			int[] answers	= enterNumbers.enterNumber();*/
			/*4文字まとめての入力*/
			int[] answers	= enterNumbers.enterNumbers(count);
			//正解数を戻り値として判定クラスから受け取る 引数には問題と回答2つの配列を渡す
			int hit = judgeNumber.judgeNumber(problems,answers);
			//正解数が配列の長さと同じ＝全問正解
			if( hit == count ) {
				System.out.println("クリア");
				//全問正解したのでwhile文を抜けるためにfalseを代入
				success = false;
			}
		}
		
		System.out.println("ゲーム終了");
	}
}

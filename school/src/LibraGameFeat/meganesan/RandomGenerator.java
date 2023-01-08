package LibraGameFeat.meganesan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//乱数を生成しリストに格納するメソッドと引数で渡された添え字に入っている数値を返すメソッドを持つクラス
class RandomGenerator {
	List<Integer> ballNumbers = new ArrayList<Integer>();
	private final int STANDARD = 100;
	
	/* 基準値が1つ、基準値に等しいものが3つ、異なるものが1つ　計5個の数値を生成
	 * 基準値以外をListに格納した後、シャッフルメソッドを使ってランダムに入れ替えるメソッド
	 */
	public void randomGenerator() {
		Random random	= new Random();
		//ArrayListに基準値を4つ格納
		for(int i = 0 ; i < 3 ; i++) {
			ballNumbers.add(STANDARD);
		}

		//0-2までの乱数を生成
		//1と生成された乱数が等しいかの繰り返し判定
		for(int i = 0 ; i < 1 ; i++) {
			int tmpNumber = random.nextInt(101) + 50;//50-150
			//重複しない場合
			if(STANDARD != tmpNumber) {//100の時を除く
				//1以外の数字をArrayListにaddする
				ballNumbers.add(tmpNumber);
				break;
			}
			//Integer型　参照 インスタンスの参照をさした上でInetegerクラスの内部で保持しているint型のデータを参照しているのかもしれない
			//整数の比較ではIntegerどう動いてるか不明
			else if(STANDARD == tmpNumber){//重複する場合やり直し
				continue;
			}
		}
		//ボールの順番をシャッフルする
		Collections.shuffle(ballNumbers);
	}
	
	//引数で渡された添え字に入っているボールの数値を返すメソッド
	public int getRamdomGenerator(int order) {
		return ballNumbers.get(order);
	}
	//基準ボールの数値を返すメソッド
	public int getStandard() {
		return STANDARD;//基準ボールを返す
	}
}

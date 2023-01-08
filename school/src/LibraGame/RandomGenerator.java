package LibraGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//乱数生成クラス　1つだけ重複していない4桁の整数を生成する
class RandomGenerator {
	List<Integer> ballNumbers = new ArrayList<Integer>();
	int standard = 100;
	
	public void randomGenerator() {
		Random random	= new Random();
		//1を4つと0か2を1つ格納する
		//ArrayListに1を4つ格納
		for(int i = 0 ; i < 3 ; i++) {
			ballNumbers.add(standard);
		}

		//0-2までの乱数を生成
		//1と生成された乱数が等しいかの繰り返し判定
		for(int i = 0 ; i < 1 ; i++) {
			int tmpNumber = random.nextInt(101) + 50;//50-150
			//重複しない場合
			if(standard != tmpNumber) {//100の時を除く
				//1以外の数字をArrayListにaddする
				ballNumbers.add(tmpNumber);
			}
			//Integer型　参照 インスタンスの参照をさした上でInetegerクラスの内部で保持しているint型のデータを参照しているのかもしれない
			//整数の比較ではIntegerどう動いてるか不明
			else if(standard == tmpNumber){//重複する場合やり直し
				i--;
			}
		}
/*		for(int i : ballNumbers) {//生成確認用
			System.out.print(i + " ");
		}*/
		
		System.out.println("");
		Collections.shuffle(ballNumbers);
		
/*		for(int i : ballNumbers) {//シャッフル確認用
			System.out.print(i + " ");
		}*/
	}
	public int getRamdomGenerator0() {
		return ballNumbers.get(0);
	}
	public int getRamdomGenerator1() {
		return ballNumbers.get(1);
	}
	public int getRamdomGenerator2() {
		return ballNumbers.get(2);
	}
	public int getRamdomGenerator3() {
		return ballNumbers.get(3);
	}
	public int getStandard() {
		return standard;//基準ボールを返す
	}
}

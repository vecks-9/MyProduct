package HitAndBlow;

import java.util.Random;
//乱数で重複していない4桁の整数を生成する
public class MakeRandomNumbers {
	public int[] makeRandomNumbers() {
		Random random	= new Random();
		int[] problems	= new int[4];
		
		//重複していない整数で生成されなければならない 重複してない場合をtrueとして初期化
		boolean isUnique = true;
		
		//格納されたデータ数 格納されるとインクリメントされていく
		int count = 0;
		//格納数が4つになるまで繰り返す：4桁
		while(count < 4) {
			//1-9までの乱数を生成
			int randomNumber = random.nextInt(9) + 1;
			//格納されたデータ数全てと生成された乱数が等しいかの繰り返し判定
			for(int i = 0 ; i < count ; i++) {
				//重複する場合
				if(problems[i] == randomNumber) {
					//重複判定にfalseを代入
					isUnique = false;
					//重複した時点で残りは飛ばす
					break;
				}
				else {//重複しない場合 重複判定にtrueを代入
					isUnique = true;
				}
			}
			//重複判定がtrueだった場合
			if(isUnique == true) {
				//問題の配列にデータ数を添え字として代入する
				problems[count] = randomNumber;
				//添え字が被らないようにインクリメント
				count++;
			}
		}
		return problems;
	}
}
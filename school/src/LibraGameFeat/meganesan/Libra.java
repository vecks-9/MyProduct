package LibraGameFeat.meganesan;

//天秤クラス
class Libra {
	//定数としての添え字番号
	private final int FIRST		= 0;
	private final int SECOND	= 1;
	private final int THIRD		= 2;
	private final int FOURTH	= 3;

	private String answer		= null;

	//基準値の受け取りと、他4つの球が持つ数値の受け取り変数
	private int standard		= 0;
	private int unknown1		= 0;
	private int unknown2		= 0;
	private int unknown3		= 0;
	private int unknown4		= 0;

	//天秤の左右
	private int libraL			= 0;
	private int libraR			= 0;

	/* ランダム生成した数値群を受け取るためのコンストラクタ
	 * 引数として受け取ったインスタンス内に保持されているリストから持ってくる
	 */
	public Libra(RandomGenerator randomGenerator) {		
		standard = randomGenerator.getStandard();
		unknown1 = randomGenerator.getRamdomGenerator(FIRST);
		unknown2 = randomGenerator.getRamdomGenerator(SECOND);
		unknown3 = randomGenerator.getRamdomGenerator(THIRD);
		unknown4 = randomGenerator.getRamdomGenerator(FOURTH);
	}

	//異なる数値を見つけ、String型として解答を返すメソッド
	public String judgeCompare() {
		//解答分の基準　個別の内容を条件分岐で判定した後で+していく
		answer	= "基準値：" + standard + " ";

		libraL = standard + unknown1;
		libraR = unknown2 + unknown3;
		
		//1回目で左右の重さが等しい場合
		if(libraL == libraR) {
			if( standard > unknown4 ) {
				answer += "unknown4が軽い 値：" + unknown4;
				
				return answer;
			}
			else if( standard < unknown4 ) {
				answer += "unknown4が重い 値：" + unknown4;
				
				return answer;
			}
			else if( standard == unknown4 ) {
				answer += "基準と同値が設定されています。";
				
				return answer;
			}
		}
		//1回目で等しくない場合　どちらに傾いてるか入れ子で分岐
		else if(libraL != libraR) {
			if( libraL > libraR ) {
				if( unknown2 == unknown3 ) {
					answer += "unknown1が重い 値：" + unknown1;
					
					return answer;
				}
				else if( unknown2 < unknown3 ) {
					answer += "unknown2が軽い 値：" + unknown2;
					
					return answer;
				}
				else if( unknown2 > unknown3 ) {
					answer += "unknown3が軽い 値：" + unknown3;
					
					return answer;
				}
			}
			else if( libraL < libraR ) {
				if( unknown2 == unknown3 ) {
					answer += "unknown1が軽い 値：" + unknown1;
					
					return answer;
				}
				else if( unknown2 > unknown3 ) {
					answer += "unknown2が重い 値：" + unknown2;
					
					return answer;
				}
				else if( unknown2 < unknown3 ) {
					answer += "unknown3が重い 値：" + unknown3;
					
					return answer;
				}
			}
		}
		//ここのリターンが実行される場合は条件分岐のいずれにも属していない＝数値が入ってないエラーを想定
		return "error";
	}
}

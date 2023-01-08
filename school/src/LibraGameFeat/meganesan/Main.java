package LibraGameFeat.meganesan;

public class Main {
	//乱数を生成し、天秤にかける　異なる数値が格納されているリストの添え字を見つける
	public static void main(String[] args) {
	
		System.out.println("fiveball");
		//乱数生成クラスのインスタンス化
		RandomGenerator randomGenerator = new RandomGenerator();
		//基準値と他4つの数値が入ったリストを生成
		randomGenerator.randomGenerator();
		
		//天秤クラスのインスタンス化
		//基準値と他4つの数値が入ったリストを保持するインスタンスを渡す
		Libra libra	= new Libra(randomGenerator);

		//数値の比較メソッド　解答の文字列を返す
		String answer = libra.judgeCompare();
		System.out.println(answer);
	}
}

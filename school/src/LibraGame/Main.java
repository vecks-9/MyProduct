package LibraGame;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("fiveball");
		//乱数生成クラス 作られた5桁の乱数(1つだけ異なる)をボールクラスに渡したい
		RandomGenerator randomGenerator = new RandomGenerator();
		
		//天秤クラスのインスタンス化　リストと基準値渡す
		Libra libra			= new Libra(randomGenerator);
		libra.judgeCompare();
		libra.showData();
	}
}
/*　問題
ボールが5個ある　そのうち1つだけ重さが異なるものがある
また、同じ重さの4つのうち1つは特定できている

天秤を2回使って重さが異なるボールがどれで、重いのか軽いのかを出す

*/
/* 今後
ボールを選ぶためのボタンがいる
それぞれのボールには重さのデータを持たせる
文字列としてアイコンデータを持たせる
ボールはそれぞれオブジェクトを生成する

1回目操作
左に載せるボールの数を選んでください→載せるボールの番号を教えてください
右に(以下同上)
操作終わり
決定しますか 1：決定 2：やり直す(ラベル？)

異常な数値を入力した場合は決定をやり直す

決定後↓
選択したものが天秤の左右に乗った図を表示する(選ばなかったボールも表示する)
天秤が傾いているかどうかを「／」「＼」「―」で表現する(文字で捕捉もする)

class Ball{}

Ball ball
	 ball1
	 ball2
	 ball3
	 ball4
	 
①②③④⑤　5つのボール
	[①②]		[③④]
処理決定
	[①②]	／	[③④]
	[①②]	＼	[③④]
	[①②]	―	[③④]


ロジック、判定はこのままでOK
まずは表示を行うようにする

表示が出来るようになったら、次は操作を受け付けられるように変更していく
少しずつ！
*/
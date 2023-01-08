import java.util.Scanner;

public class C099 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//文字列の入力受付　空白を除去して配列に格納
		String numbers = scanner.nextLine();
		String[] separateNumber = numbers.split(" ");
		//配列に格納された2つをそれぞれint型に変換して変数に代入する
		int pics = Integer.parseInt(separateNumber[0]);
		int oneLength = Integer.parseInt(separateNumber[1]);
        //重なっている部分の変数として宣言
		int overLap = 0;
		//最初の1枚を除いて追加で置いていく枚数文の繰り返し
		for(int i = 0; i < (pics - 1);i++) {
		    //文字列として数字を受け取り、変換して変数に代入
			String stringSurplus = scanner.nextLine();
			int surplus = Integer.parseInt(stringSurplus);
			//1辺から余剰として与えられている数値を引いた分を重なっている辺の長さとして合算していく
			overLap += (oneLength - surplus);
		}
		//求めるのは面積であるため、縦の長さ×横の長さ
		//横の長さは元々の1辺の長さに合算していった重なっている部分を足したもの
		System.out.println(oneLength*(oneLength + overLap));
	}

}
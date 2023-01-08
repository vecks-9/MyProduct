package HitAndBlow;

import java.util.Scanner;
//入力受付クラス 一文字ずつ

public class EnterNumber {
	public int[] enterNumber() {
		int[] answers = new int[4];
		
		Scanner scanner = new Scanner(System.in);
		//1文字ずつの受け取り 4文字まとめての受け取りは別で作成すること
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("入力が重複しないように" + (i + 1) + "番目の数字を入れてください\n入力範囲は1～9\n");
			answers[i] = scanner.nextInt();
		}
		
		System.out.println("入力した数値は以下");
		//入力した値を表示 拡張for文 確認用ではあるけど、表示した方がやりやすい
		for(int num : answers) {
			System.out.print(num + " ");
		}
		
		//scanner.close();するとエラーになる どうしたらええか分からん→無し！
		return answers;
	}
}
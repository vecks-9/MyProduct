package HitAndBlow;

import java.util.Random;
import java.util.Scanner;

public class Foundation {
	public static void main(String[] args) {
		System.out.println("hit and blow\n");
		
		Scanner scanner = new Scanner(System.in);
		Random random	= new Random();
		
		int[] problems	= new int[4];
		int[] answers	= new int[4];

		//重複していない場合trueとなる trueで初期化
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
				else {//重複しない場合
					//重複判定にtrueを代入
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
		
		boolean success = true;
		
		while(success) {
			int hit = 0;
			int blow = 0;
		
			for(int i = 0 ; i < 4 ; i++) {
				System.out.println("入力が重複しないように" + (i + 1) + "番目の数字を入れてください\n入力範囲は1～9\n");
				answers[i] = scanner.nextInt();
			}
			
/*			System.out.println("入力する配列");
			
			for(int num : answers) {
				System.out.print(num + " ");
			}*/
			
			//問題配列の表示　確認用
/*			System.out.println("\n問題回答の配列");
			for(int num : problems) {
				System.out.print(num + " ");
			}*/
			//以下判定
			for(int i = 0 ; i < count ; i++) {
				//同じ場所に同じ数字が入っていればhit
				if( answers[i] == problems[i] ) {
					System.out.println("\n" + ( i + 1) + "番目は正解です");
				
					hit += 1;
				}
				else {//blowかどうかの判定 forループで総当たり
					for(int j = 0 ; j < count ; j++) {
						if( answers[i] == problems[j] ) {
							System.out.println("\nおしい！" + answers[i] + "は答えに含まれます");

							blow += 1;
						}
					}
				}
			}
				System.out.println("\nhit:" + hit + "\tblow:" + blow);
				if( hit == 4 ) {
					System.out.println("クリア");
					
					success = false;
				}
		}
	}
}

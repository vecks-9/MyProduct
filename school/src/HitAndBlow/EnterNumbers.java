package HitAndBlow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//入力受付クラス 4文字まとめて
public class EnterNumbers {	
	public int[] enterNumbers(int count) {
		int[] answers = new int[count];
		
		BufferedReader br = null;
		System.out.println("入力が重複しないように数字を入れてください\n入力範囲は1～9\n");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] lines = line.split("");
			
			for(int i = 0 ; i < count ; i++) {
				answers[i] = Integer.parseInt(lines[i]);
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("文字入力は無効です\n");
		}
/*		入力された配列の確認用
		for(int value : answers) {
			System.out.print(value + "");
		}*/
		return answers;
	}
}
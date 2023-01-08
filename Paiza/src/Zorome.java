import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*	2桁～4桁の整数入力を受付、ぞろ目かどうかを判定
	「12 3」や「11 26」のように月と日の間に半角スペースを入れて入力される
*/
public class Zorome {

	public static void main(String[] args) {

//	整数入力の受付
		Scanner scanner = new Scanner(System.in);

//	文字列として受け取り
		String monthDay = scanner.nextLine();

//	空白部を削除
		String daysMonth = monthDay.replaceAll(" ","");//"123"

/*	文字列受け取り確認用
	System.out.println(daysMonth);//123
*/
/*	一文字に分割するので、受け取り用にchar型の配列を準備
	長さは受け取った文字列の要素数(空白除去済)
*/		char[] dayArray = new char[daysMonth.length()];

//	charAtを用いて要素を1文字ずつ配列に格納
		for(int i = 0; i < daysMonth.length(); i++ ){

			dayArray[i] = daysMonth.charAt(i);//"1", "2", "3"

		}

//	重複除去用にHashSetを準備
		Set<Character> checkers = new HashSet<Character>();

//	HashSetに格納していく
		for(int j = 0; j < daysMonth.length(); j++ ){
			checkers.add(dayArray[j]);

/*	格納されたか、重複除去されているかの確認用
			for(Character checker : checkers){
				System.out.println(checker + "\t");
			}
*/		}
//		System.out.println(checkers);
//	重複除去された結果要素数が1であれば、全て同じ数値あることが分かるのでぞろ目→true
		if(checkers.size() == 1){
			System.out.println("Yes");
		}

//	要素数が1でない場合は、異なる数値が含まれているのでfalse
		else {
			System.out.println("No");
		}
//	入力受付を閉じる
		scanner.close();
	}
}
/*
[月 日]の形で入力を受け取る ぞろ目ならYes、違えばNoを返す
C:\java20221024\review>java ParallelDays2
12 3
No

C:\java20221024\review>

C:\java20221024\review>java ParallelDays2
11 11
Yes

C:\java20221024\review>
*/
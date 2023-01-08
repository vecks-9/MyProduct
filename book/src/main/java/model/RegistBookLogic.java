package model;
//ログイン成否判定クラス
public class RegistBookLogic {
	//戻り値がtrue false　引数にユーザーオブジェクトもろてる
	//このユーザーオブジェクトが持ってるパスワードは、ログイン時に入力された値を持っている
	public boolean execute(Book registBook) {
//		if(registBook.getTitle() != null && registBook.getImpression() != null) {
			//これは確認用
			System.out.println("ok");
			//trueを返します
			return true;
/*		}
		else {
			//確認用
			System.out.println("No");
			//falseを返します
			return false;
		}*/
	}
}
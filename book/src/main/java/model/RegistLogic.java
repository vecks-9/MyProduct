package model;
//ログイン成否判定クラス
public class RegistLogic {
	//戻り値がtrue false　引数にユーザーオブジェクトもろてる
	//このユーザーオブジェクトが持ってるパスワードは、ログイン時に入力された値を持っている
	public boolean execute(User user) {
		if(user.getPass() != null && user.getUserId() != null) {
			//これは確認用
			System.out.println("ok");
			//trueを返します
			return true;
		}
		else {
			//確認用
			System.out.println("No");
			//falseを返します
			return false;
		}
	}
}
package model;
//ログイン成否判定クラス
public class LoginLogic {
	//戻り値がtrue false　引数にユーザーオブジェクトもろてる
	//このユーザーオブジェクトが持ってるパスワードは、ログイン時に入力された値を持っている
	public boolean execute(User user) {
		//もしユーザオブジェクトに格納されているパスワードが1234と同じであれば(trueならば)
		if(user.getPass().equals("1234")) {
			//これは確認用
			System.out.println("pass:" + user.getPass());
			//trueを返します
			return true;
		}
		//もし1234と同じでなかったら
		else {
			//確認用
			System.out.println("fales pass:" + user.getPass());
			//falseを返します
			return false;
		}
	}
}
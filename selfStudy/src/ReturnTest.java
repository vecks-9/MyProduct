/**
 * 
 */

/**
 * @author sakam
 *
 */
public class ReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(warizan3(123456789));
		System.out.println(warizan3(15));
		System.out.println(warizan3(22));
		System.out.println(warizan3(987654321));
		//warizan3メソッドを呼び出す　引数は(int n)の形式で渡す
		
		//②　①からresultMessageを返してもらっている
		//println(resultMessage)になる
		
//		int a = 15;
//		if(isMultipleOf3(a)) {
//			System.out.println(a+"は3で割り切れます");
//		}else{
//			System.out.println(a+"は3で割り切れません");
	}
//}
	public static String warizan3(int n) {
		//warizan3の引数を持ってきている
		
		String resultMessage;
		//resultMessageの初期化
		if(n%3==0) {
		//もし、3で割り切った余りが0であるか否かの判断
			resultMessage=n+"は3で割り切れます";
		//resultMessageに代入する
		}else {
			resultMessage=n+"は3で割り切れません";
		}
		return resultMessage;
		//resultMessageをwarizan3に返している　↑に帰る①
	
	//public static boolean isMultipleOf3(int n) {
		
		//boolean result;
		//result=(n%3==0);
		//return result;
	}
	
}
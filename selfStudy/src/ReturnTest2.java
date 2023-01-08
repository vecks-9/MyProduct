/**
 * 
 */

/**
 * @author sakam
 *
 */
public class ReturnTest2 {
	public static void main(String[] args) {
		System.out.println(isMultipleOf3(123456789));
		System.out.println(isMultipleOf3(15));
		System.out.println(isMultipleOf3(22));
		System.out.println(isMultipleOf3(987654321));
	}

	public static String isMultipleOf3(int n) {
		String resultMessage="";
		if(n%3==0) {
			resultMessage=n+"は3で割り切れます";
		}else {
			resultMessage=n+"は3で割り切れません";
		}
		return resultMessage;
	}
}
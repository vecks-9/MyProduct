package Substring;

public class Sample1 {

	public static void main(String[] args) {
		EnterData enterData = new EnterData();
		
		/*
		 * 2つの整数　と　文字列
		 * 文字列から2つの整数の範囲にある文字列を切り出す
		 */
		String number = enterData.enterString();;
		String words = enterData.enterString();;
		String[] numbers = number.split(" ");
		
		int first = Integer.parseInt(numbers[0]);
		int second = Integer.parseInt(numbers[1]);
		
		System.out.println(first + " " + second);
		
		String substringWords = words.substring((first - 1),second);
		
		System.out.println(substringWords);
		
	}

}

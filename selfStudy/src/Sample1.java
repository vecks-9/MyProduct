import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		/*
		 * scanner.next()は最初の空白やタブ、改行(区切り文字)までの部分を値として受け取る際に使う
		 * 数字はscanner.nextInt() intに代入
		 * nextLong(),nextDouble(),nextShort(),nextBigInteger(),nextBigDecimal()がある
		 * 
		 */
		System.out.println(s1);

}
}
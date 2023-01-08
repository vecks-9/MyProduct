import java.util.Scanner;

public class Mr_kins {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//回数の受け取り
		int numN		= scanner.nextInt();
		scanner.nextLine();
		//電波強度の受け取り　文字列
		String numD		= scanner.nextLine();
		//文字列に含まれる半角スペースを削除
		numD			= numD.replace(" ", "");
		//char型の配列Aを準備　長さは電波強度入力回数
		char[] numA		= new char[numN];
		//int型の配列Bを準備　長さは同上
		int[] numB		= new int[numN];
		
		for(int i = 0; i < numN; i++) {
			//配列Aへ文字列を1文字ずつ順に格納
			numA[i] = numD.charAt(i);
			//配列BへAに格納された1文字ずつの整数文字列データを
			numB[i]	= Character.getNumericValue(numA[i]);
		}

		int numC = 0;
		for(int value: numB) {
			if(value > 5) {
				numC += 1;
			}
		}
		
		System.out.println(numC);
		
		scanner.close();
	}
}
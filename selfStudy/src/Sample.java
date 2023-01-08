import java.util.Random;

public class Sample {
	public static void main(String[] args) {
		Random random = new Random();
	
		RandomNumber randomNumber = new RandomNumber();
		
		int times = random.nextInt(10)+1;
		
		System.out.println("5以上の数の合算\n");
		int[] numbers = new int[times];
		
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = randomNumber.getRandomNumber();
		}
		
		int sumNumber = 0;
		int otherNumber = 0;
		
		System.out.println("配列の要素");
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.print(numbers[i] + "\t");
		}
		
		System.out.println("\n合算処理");
		for(int i = 0 ; i < numbers.length ; i++) {
			if( numbers[i] >= 5 ) {
				sumNumber += numbers[i];
			}
			else {
				otherNumber += numbers[i];
			}
		}
		
		System.out.println("5以上の合算は" + sumNumber);
		System.out.println("5未満の合算は" + otherNumber);
		
	}
}

class RandomNumber {
	Random random = new Random();
	int randomNumber = 0;
	
	public int getRandomNumber() {
		randomNumber = random.nextInt(21) - 10;
	
		return randomNumber;
	}
}
/*
数値(5,1,7,2,4)を配列に格納し、5以上を合算した値を出力するプログラムを作成

→5以上を合算した値、かつ5未満を合算した値を出力

→配列に格納する値を乱数から生成する　乱数は別クラスで生成し、戻り値で格納する

→配列の長さを乱数で決定する　長さの乱数はメインメソッドでよい

→出力を別クラスに分ける

*/

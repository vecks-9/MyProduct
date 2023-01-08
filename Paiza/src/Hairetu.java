import java.util.Random;

public class Hairetu {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] points = {random.nextInt(8), random.nextInt(8), random.nextInt(8), random.nextInt(8), random.nextInt(8), random.nextInt(8), random.nextInt(8), random.nextInt(8)};
		int sum = 0;
		
		for(int i = 0 ; i < points.length ; i++) {
			if(points[i] >= 5) {
				sum += points[i];
			}
		}
		System.out.println("配列に生成された数字は以下");
		
		for(int i = 0; i < points.length ; i++) {
			System.out.print(points[i] + " ");
		}
		System.out.println("\n配列に含まれる数字の5以上を合算した値は以下");
		System.out.println(sum);
	}

}

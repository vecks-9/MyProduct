
public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		4, 0, 5, -1, 3, 10, 6, -8
		int[] points = {4, 0, 5, -1, 3, 10, 6, -8};
		int sum = 0;
		
		for(int i = 0 ; i < points.length ; i++) {
			if(points[i] >= 5) {
				sum += points[i];
			}
		}
		System.out.println(sum);
	}

}

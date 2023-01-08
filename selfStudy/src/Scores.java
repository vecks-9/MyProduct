/**
 * 
 */

/**
 * @author sakam
 *
 */
public class Scores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] names = new String[] {"aoki","iida","ueda","eto"};
		int[] scores = new int[] {80,65,70,95};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+"さんの点数:"+scores[i]+"点");
		}
	}

}

import java.util.Scanner;

public class PaizaC097 {
//当選者の判別プログラム
/* ｎ人の
 * 
 */
	final static int SUBMISSION = 0;
	final static int CONDITIONA = 1;
	final static int CONDITIONB = 2;

	public static void main(String[] args) {
		
		int submission = -1;
		int conditionA = -1;
		int conditionB = -1;
			
		Scanner scanner = new Scanner(System.in);
		
		String submissions = scanner.nextLine();
		
		String[] separateNumbers = submissions.split(" ");
		
		submission = Integer.parseInt(separateNumbers[SUBMISSION]);
		
		conditionA = Integer.parseInt(separateNumbers[CONDITIONA]);
		
		conditionB = Integer.parseInt(separateNumbers[CONDITIONB]);
		

		for(int i = 0 ; i < submission ; i++ ) {
			if(((i + 1) % conditionA == 0)&&((i + 1) % conditionB == 0)) {
				System.out.println("AB");
			}
			else if(((i + 1) % conditionA == 0)) {
				System.out.println("A");
			}
			else if(((i + 1) % conditionB == 0)) {
				System.out.println("B");
			}
			else {
				System.out.println("N");
			}
		}
		scanner.close();
/*		int test = submission % conditionA;
		
		System.out.println(test);
		System.out.println(conditionA);
		System.out.println(conditionB);*/
	}	
}

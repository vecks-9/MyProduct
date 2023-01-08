import java.util.Scanner;

public class Verifi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int times		= scanner.nextInt();
		scanner.nextLine();
		String number	= scanner.nextLine();
		String[] numbers= number.split(" ");
/*		
		for(String value : numbers) {
				System.out.print(value + "\t");
		}
*/
		
		int[] resultNumbers = new int[times];
		
		
		for(int i = 0; i < resultNumbers.length; i++) {
			resultNumbers[i] = Integer.parseInt(numbers[i]); 
		}
		
		int success = 0;
		
		for(int value : resultNumbers) {
			if(value > 5) {
				success += 1;
			}
		}
		
		System.out.println(success);
	}
}
import java.util.Scanner;

public class ForBenkyo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cycle = scanner.nextInt();
		
		int sumNumber = 0;
		
		for(int i = 0; i < cycle ; i++) {
			int number = scanner.nextInt();
		
			if(number >= 5) {
				sumNumber += number;
			}
		}
		System.out.println(sumNumber);
		
		scanner.close();
	}
}

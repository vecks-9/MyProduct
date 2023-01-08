/*
import java.util.Scanner;

public class Oomoji {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		String number = scanner.nextLine();
		String[] numbers = number.split(" ");
		
		int first = Integer.parseInt(numbers[0]);
		int second = Integer.parseInt(numbers[1]);
		
		String message = scanner.nextLine();
		
		String ans = message.toUpperCase();
	}

}
*/
import java.util.Scanner;

public class Oomoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println(string.substring(0, start - 1) + string.substring(start - 1, end).toUpperCase() + string.substring(end));
    }
}

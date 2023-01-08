
public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				System.out.println("Welcome to the House of Divination");
				
				System.out.println("Please enter your name");

		String name=new java.util.Scanner(System.in).nextLine();
				
				System.out.println("Please enter your age");
			
		String ageString=new java.util.Scanner(System.in).nextLine();
		
		int age=Integer.parseInt(ageString);
		
		int fortune=new java.util.Random().nextInt(4);

			fortune++;

				System.out.println("The results of the fortune-telling are in.");

				System.out.println(age+" year old "+name+", your luck number is "+fortune+".");

				System.out.println("1st:excellent,2nd:good+,3rd:good,4th:bad");
	}

}

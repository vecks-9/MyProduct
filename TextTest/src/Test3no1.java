
public class Test3no1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int weight=60;//-------①
		
		if(weight==60){
			System.out.println("ok");
		} else {
			System.out.println("bad");
		}
		
		int age=2;//---------③
		
		if(age%2==0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		
		String name="湊";//----------④

		if(name.equals("湊")) {
			System.out.println("exactry");
		}else {
			System.out.println("no");
		}
		
		int age1=18;
		int age2=25;//------------②
		
		if((age1+age2)*2>60) {
			System.out.println("60over");
		}else
			System.out.println("under");
	}

}
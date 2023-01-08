
public class MethodTest2 {
	public static void main(String[] args){
		System.out.println("mainメソッドが呼ばれました");
		for(int i=0; i<5; i++) {
			sub();
			}
	}
	public static void sub() {
		System.out.println("subメソッドが呼ばれました");
	}

}
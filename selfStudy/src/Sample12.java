import java.util.Scanner;


public class Sample12 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a%10)==(b%10)){
            if((a/10)==b){
                System.out.println("Yes");}
            }else{
            	if(a==(b/10)){
                System.out.println("Yes");
            }else{
               System.out.println("No");
            }
}
}
}
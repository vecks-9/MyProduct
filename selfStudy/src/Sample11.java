import java.util.Scanner;


public class Sample11 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        
        if((a%10)==(b%10)){
            if(a==b){
                System.out.println("Yes");
            }else
        System.out.println("No");
        
    }else
    System.out.println("No");
        
}
}
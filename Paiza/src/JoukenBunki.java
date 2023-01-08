import java.util.Scanner;


public class JoukenBunki {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        String time = scanner.nextLine();
        int times = Integer.parseInt(time);
        
        for(int i = 0 ; i < times ; i++) {
            String number = scanner.nextLine();
            String[] numbers = number.split(" ");
            
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            
            if(first != second) {
                ans += first + second;
            }
            else {
                ans += first * second;
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
/*
 * import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        long sum = 0;
        
        for (int i = 0; i < times; i++) {
            long tmp[] = new long[2];
            tmp[0] = scanner.nextInt();
            tmp[1] = scanner.nextInt();

            if (tmp[0] != tmp[1]) {
                sum += (tmp[0] + tmp[1]);
            } else {
                sum += (tmp[0] * tmp[1]);
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
 */
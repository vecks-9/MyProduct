import java.util.Scanner;

public class TimeParadox {
    
    //0,1,2に意味を持たせる静的な定数を宣言 クラス直下に置くのがいい
    final static int LEAVE		= 0;
    final static int FLIGHT	= 1;
    final static int ARRIVAL	= 2;
    
    public static void main(String[] args) {
        //最小値と最大値を初期化
        int min = 48;
        int max = 0;
                
        //日程を入力 文字列を数値に変換
        Scanner scanner		= new Scanner(System.in);
        String day			= scanner.nextLine();
        int scheduleCount	= Integer.parseInt(day);
        //日程数分の繰り返し
        for(int i=0;i<scheduleCount;i++) {
            //合計値の初期化
            int sum = 0;
            //文字列daysに入力値を渡して、半角スペースのスプリットで文字列配列化
            String days = scanner.nextLine();
            String[] separateDays = days.split(" ");
            
            //各変数に代入 離陸、飛行、到着
            int leaveCountryHour		= Integer.parseInt(separateDays[LEAVE]);
            int flightHour				= Integer.parseInt(separateDays[FLIGHT]);
            int immigrationCountryHour	= Integer.parseInt(separateDays[ARRIVAL]);
        
            //それぞれの変数を参照して計算
            sum =( leaveCountryHour + flightHour + (24 - immigrationCountryHour));
                
            //合計値がminより小さければminに代入
            if(sum < min){
                min = sum;
            }
            //合計値がmaxより大きければmaxに代入
            if(sum > max) {
                max = sum;
            }
        }
        //最小値　改行　最大値
        System.out.println(min + "\n" + max);
        //Scannerを閉じる
        scanner.close();
    }    
}
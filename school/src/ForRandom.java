import java.util.Random;

public class ForRandom {

    public static void main(String[] args) {
        Random random = new Random();
        //配列の長さを示す変数cycleに100~199の値をランダムに生成し代入
 //       int cycle    = random.nextInt(100)+100;
        int cycle    = 200;
        //変数cycleには生成した乱数が入っている
        int[] nums    = new int[cycle];
        //配列の長さと同等の回数0～99の乱数を生成して格納
        for(int i = 0; i < nums.length ; i++) {
            nums[i] = random.nextInt(100);
        }
        
        System.out.println("配列");
        //拡張for文を用いて配列numsの中身を順に表示
        for(int value : nums) {
            System.out.print(value + "\t");
        }
        //大きい数字を退避させるための変数largeを用意
        int large = 0;
        //配列の長さと同等の回数繰り返すfor文を入れ子
        for(int i = 0; i < nums.length ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
/*  初回時処理の流れ：0番目に入っている要素と1番目に入っている要素を比較
    0番目の要素が大きかった場合は、比較対象を2､3番目へと移していく
    比較相手の要素が0番目以上になった際、if文の条件式がtrueとなり｛｝に移る
    退避用に宣言していたlargeに0番目より大きい方の要素を代入
    比較相手の要素があった配列番号に0番目の要素を代入
    0番目にlargeに代入された大きい要素を代入する
*/
                if( nums[i] < nums[j] ) {
                    large = nums[j];
                    nums[j] = nums[i];
                    nums[i] = large;
                }
            }
        }

        System.out.println("\n大＞小");
// 拡張for文を用いて順序が入れ替わり終わった配列numsを順に表示していく
        for(int value : nums) {
            System.out.print(value + "\t");
        }
    }
}

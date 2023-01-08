//Gaminパッケージに含まれる
package Gaming;

public class GameSale {

	public static void main(String[] args) {
		//ゲームクラスのオブジェクト化
		Game game=new Game("Metal: Hellsinger","steam",20220915);
		//newする時に引数を渡さない場合のみデフォルトコンストラクタが存在する
		//引数を渡すとデフォルトコンストラクタは消える
		Game game2=new Game("splatoon3","switch",20220909);
		Game game3=new Game("EXOPRIMAL","Steam");
		Game game4=new Game("dragonquest XII");
		Game game5=new Game();
			
			
			System.out.println("タイトル:"+game.title);
			System.out.println("プラットフォーム："+game.platform);
			System.out.println("発売日："+game.release);
			System.out.println("");
				
			System.out.println("タイトル:"+game2.title);
			System.out.println("プラットフォーム:"+game2.platform);
			System.out.println("発売日："+game2.release);
			System.out.println("");
			
			System.out.println("タイトル:"+game3.title);
			System.out.println("プラットフォーム:"+game3.platform);
			System.out.println("発売日："+game3.release);
			System.out.println("");
				
			System.out.println("タイトル:"+game4.title);
			System.out.println("プラットフォーム:"+game4.platform);
			System.out.println("発売日："+game4.release);
			System.out.println("");
			
			System.out.println("タイトル:"+game5.title);
			System.out.println("プラットフォーム:"+game5.platform);
			System.out.println("発売日："+game5.release);
			
		}
}
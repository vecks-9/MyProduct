import java.util.Scanner;

public class SeisekiKanri {//成績入力管理
	public static void main(String[] args) {
//テスト結果計算のインスタンス化
		TestAdmin testAdmin = new TestAdmin();
//入力受付のインスタンス化
		EnterData enterData = new EnterData();
		
		System.out.println("－－データ入力ここから－－\n");
		
//StudentObjectのインスタンス化 引数で生徒番号、氏名、国語と算数の得点の入力メソッドをそれぞれ呼び出し、戻り値を利用
		StudentObject student0 = new StudentObject(enterData.numberEnter(),enterData.nameEnter(),enterData.kokugoEnter(),enterData.sansuEnter());
		StudentObject student1 = new StudentObject(enterData.numberEnter(),enterData.nameEnter(),enterData.kokugoEnter(),enterData.sansuEnter());
		StudentObject student2 = new StudentObject(enterData.numberEnter(),enterData.nameEnter(),enterData.kokugoEnter(),enterData.sansuEnter());
/*		Student student3 = new Student(enterData.numberEnter(),enterData.nameEnter(),enterData.kokugoEnter(),enterData.sansuEnter());
		Student student4 = new Student(enterData.numberEnter(),enterData.nameEnter(),enterData.kokugoEnter(),enterData.sansuEnter());*/

		System.out.println("\n－－データ入力ここまで－－\n");
		
//結果表示のタイトル表示メソッドを呼び出し
		testAdmin.showDataStart();
//各オブジェクトの合計値算出メソッドを呼び出し		
		testAdmin.calcPoint(student0);
		testAdmin.calcPoint(student1);
		testAdmin.calcPoint(student2);
/*		testAdmin.calcPoint(student3);
		testAdmin.calcPoint(student4);*/
		
//国語と算数の合算値表示メソッドを呼び出し
		testAdmin.showDataEnd();
	}
}

//入力受付クラス
class EnterData {
	Scanner scanner = new Scanner(System.in);

	public String numberEnter() {
		System.out.print("生徒番号を入力＞");
		String number = scanner.nextLine();
		
		return number;
	}
	public String nameEnter() {
		System.out.print("生徒名を入力＞");
		String name = scanner.nextLine();
		
		return name;
	}
	
	public int kokugoEnter() {
		System.out.print("国語の得点を入力：");
		int kokugo = scanner.nextInt();
/*	算数を使用しない場合は下段を使用すること*/
// 		scanner.nextLine();
		return kokugo;
	}
	public int sansuEnter() {
		System.out.print("算数の得点を入力：");
		int sansu = scanner.nextInt();
		scanner.nextLine();
		return sansu;
	}
}

class StudentObject {
	private String stdNumber;
	private String stdName;
	private int kokugo;
	private int sansu;
//コンストラクタ	
	public StudentObject(String stdNumber,String stdName, int kokugo, int sansu ){
		this.stdNumber = stdNumber;
		this.stdName = stdName;
		this.kokugo = kokugo;
		this.sansu = sansu;
	}
	
	public void setStdNumber(String stdNumber) {
		this.stdNumber = stdNumber;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setKokugo(int kokugo) {
		this.kokugo = kokugo;
	}
	public void setSansu(int sansu) {
		this.sansu = sansu;
	}
	
	public String getStdNumber() {
		return stdNumber;
	}
	public String getStdName() {
		return stdName;
	}
	public int getKokugo() {
		return kokugo;
	}
	public int getSansu() {
		return sansu;
	}
}

class TestAdmin {
	private String stdNumber;
	private String stdName;
	private int kokugo;
	private int sansu;
	private int calcPoint;
	
	private int kokugoSum;
	private int sansuSum;
	
	public void calcPoint(StudentObject student) {
		this.stdNumber	= student.getStdNumber();
		this.stdName	= student.getStdName();
		this.kokugo	= student.getKokugo();
		this.sansu	= student.getSansu();
//個人の合計点算出
		calcPoint = kokugo + sansu;
//国語と算数を都度加算		
		kokugoSum += kokugo;
		sansuSum += sansu;
//個々人で結果を出力
		showData();
	}
	
	public void showDataStart() {
		System.out.print("生徒番号\t氏  名\t\t国語\t算数\t合 計\n");
	}
	
	public void showData() {
		System.out.print(stdNumber + "\t");
		System.out.print(stdName + "\t");

		if(kokugo < 10) {
			System.out.print(" ");
		}
		System.out.print(kokugo + "点\t");
		
		if(sansu < 10) {
			System.out.print(" ");
		}
		System.out.print(sansu + "点\t");
		
		if(calcPoint < 100) {
			System.out.print(" ");
		}
		System.out.print(calcPoint + "点\n");
	}
	
	public void showDataEnd() {
		System.out.print("\t\t\t国語合計：" + kokugoSum + "点");
		System.out.print("\t算数合計：" + sansuSum + "点\n");
	}
}
/*
－－データ入力ここから－－

生徒番号を入力＞00000001
生徒名を入力＞サンプルABC
国語の得点を入力：12
算数の得点を入力：64
生徒番号を入力＞00000002
生徒名を入力＞サンプルDEF
国語の得点を入力：91
算数の得点を入力：64
生徒番号を入力＞00000003
生徒名を入力＞サンプルGHI
国語の得点を入力：67
算数の得点を入力：88

－－データ入力ここまで－－

生徒番号	氏  名		国語	算数	合 計
00000001	サンプルABC	12点	64点	 76点
00000002	サンプルDEF	91点	64点	155点
00000003	サンプルGHI	67点	88点	155点
			国語合計：170点	算数合計：216点

*/
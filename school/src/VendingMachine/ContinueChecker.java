package VendingMachine;

import java.util.Scanner;

class ContinueChecker {
	boolean venderPower = true;
	int powerCheck;
	
	public boolean continueCheck() {
		//BufferReaderに変える
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n\n\nプログラムを継続しますか？\n継続する場合は1を、終了する場合は2を入力してください");
			powerCheck = scanner.nextInt();
			
			switch(powerCheck) {
				case 1:
					venderPower = true;
					break;
				case 2:
					venderPower = false;
					break;
				default :
					System.out.println("異常な入力を検知。プログラム終了を回避しました。");
					venderPower = true;
					break;
			}
			
//	scanner.close();
	return venderPower;
	}
}

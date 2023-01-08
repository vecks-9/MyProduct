package LibraGame;

class Libra {//天秤クラス
	String answer			= null;

	//
	private int standard	= 0;
	private int unknown1	= 0;
	private int unknown2	= 0;
	private int unknown3	= 0;
	private int unknown4	= 0;
	//天秤の左右
	int libraL = 0;	int libraR = 0;
	
//	public Libra(List<Integer> randomGenerator, int standard) {
	public Libra(RandomGenerator randomGenerator) {		
		standard		= randomGenerator.getStandard();
		unknown1		= randomGenerator.getRamdomGenerator0();
		unknown2		= randomGenerator.getRamdomGenerator1();
		unknown3		= randomGenerator.getRamdomGenerator2();
		unknown4		= randomGenerator.getRamdomGenerator3();
	}

	public void judgeCompare() {
		answer	= "基準値：" + standard + " ";

		libraL = standard + unknown1;
		libraR = unknown2 + unknown3;
		
		if(libraL == libraR) {
			if( standard > unknown4 ) {
				answer += "unknown4が軽い 値：" + unknown4;
			}
			else if( standard < unknown4 ) {
				answer += "unknown4が重い 値：" + unknown4;
			}
			else if( standard == unknown4 ) {
				answer += "基準と同値が設定されています。";
			}
		}
		else if(libraL != libraR) {
			if( libraL > libraR ) {
				if( unknown2 == unknown3 ) {
					answer += "unknown1が重い 値：" + unknown1;
				}
				else if( unknown2 < unknown3 ) {
					answer += "unknown2が軽い 値：" + unknown2;
				}
				else if( unknown2 > unknown3 ) {
					answer += "unknown3が軽い 値：" + unknown3;
				}
			}
			else if( libraL < libraR ) {
				if( unknown2 == unknown3 ) {
					answer += "unknown1が軽い 値：" + unknown1;
				}
				else if( unknown2 > unknown3 ) {
					answer += "unknown2が重い 値：" + unknown2;
				}
				else if( unknown2 < unknown3 ) {
					answer += "unknown3が重い 値：" + unknown3;
				}
			}
		}
	}
	
	public void showData() {
		System.out.println(answer);
	}
}

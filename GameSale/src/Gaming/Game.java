package Gaming;

public class Game{

	String title;
	String platform;
	int release;

		Game(String title,String platform,int release){
			this.title=title;
			this.platform=platform;
			this.release=release;
		}
		Game(String title,String platform){
			this(title,platform,0);
		}

		Game(String title){
			this(title,"tba",0);
		}

		Game(){
			this("unknown","tba",0);

		}
}


import java.util.Random;

public class SampleKinSeisekiKanri {
	public static void main(String[] args) {
		System.out.println("成績管理\n");
		Random random	= new Random();
		Seiseki seiseki	= new Seiseki();
		
		Student student1	= new Student(2022041001, "織田信長", random.nextInt(51)+50, random.nextInt(51)+50);
		Student student2	= new Student(2022041002, "徳川家康", random.nextInt(51)+50, random.nextInt(51)+50);
		Student student3	= new Student(2022041003, "豊臣秀吉", random.nextInt(51)+50, random.nextInt(51)+50);
		Student student4	= new Student(2022041004, "上杉謙信", random.nextInt(51)+50, random.nextInt(51)+50);
		Student student5	= new Student(2022041005, "武田信玄", random.nextInt(51)+50, random.nextInt(51)+50);
		
		System.out.println("生徒番号\t" + "名前\t\t" + "国語\t" + "算数\t" + "合計");
		
		seiseki.kozinData(student1);
		seiseki.kozinData(student2);
		seiseki.kozinData(student3);
		seiseki.kozinData(student4);
		seiseki.kozinData(student5);
		
		seiseki.showData(student1, student2, student3, student4, student5);
	}
}

class Seiseki {
	private int		studentnum;
	private String	studentname;
	private int		kokugo;
	private int		sansu;
	private int		kokugototal;
	private int		sansutotal;
	
	public void kozinData(Student student) {
		studentnum		= student.getStudentnum();
		studentname		= student.getStudentname();
		kokugo			= student.getStudentkokugo();
		sansu			= student.getStudentsansu();
		int total		= kokugo + sansu;
		
		System.out.println(studentnum + "\t" + studentname + "\t" + kokugo + "点\t" + sansu + "点\t" + total + "点");
	}
	
	public void showData(Student student1, Student student2, Student student3, Student student4, Student student5) {
		this.kokugototal	+= student1.getStudentkokugo();
		this.kokugototal	+= student2.getStudentkokugo();
		this.kokugototal	+= student3.getStudentkokugo();
		this.kokugototal	+= student4.getStudentkokugo();
		this.kokugototal	+= student5.getStudentkokugo();
		this.sansutotal		+= student1.getStudentsansu();
		this.sansutotal		+= student2.getStudentsansu();
		this.sansutotal		+= student3.getStudentsansu();
		this.sansutotal		+= student4.getStudentsansu();
		this.sansutotal		+= student5.getStudentsansu();
		
		System.out.println("\t\t\t合計\t" + kokugototal + "点\t" + sansutotal + "点");
	}
}


/*
生徒番号
名前
国語
算数
*/
class Student {
	private int		studentnum;
	private String	studentname;
	private int		kokugo;
	private int		sansu;
	
	public Student(int studentnum, String studentname, int kokugo, int sansu) {
		this.studentnum		= studentnum;
		this.studentname	= studentname;
		this.kokugo			= kokugo;
		this.sansu			= sansu;
	}
	
	public void setStudentnum(int studentnum) {
		this.studentnum		= studentnum;
	}
	public void setStudentname(String studentname) {
		this.studentname	= studentname;
	}
	public void setStudentkokugo(int kokugo) {
		this.kokugo			= kokugo;
	}
	public void setStudentsansu(int sansu) {
		this.sansu			= sansu;
	}

	public int getStudentnum() {
		return studentnum;
	}
	public String getStudentname() {
		return studentname;
	}
	public int getStudentkokugo() {
		return kokugo;
	}
	public int getStudentsansu() {
		return sansu;
	}
}

/*
c:\seisekikanri20221104\lesson01>java Sample1
成績管理

生徒番号        名前            国語    算数    合計
2022041001      織田信長        53点    99点    152点
2022041002      徳川家康        56点    89点    145点
2022041003      豊臣秀吉        76点    62点    138点
2022041004      上杉謙信        85点    66点    151点
2022041005      武田信玄        83点    65点    148点
                        合計    353点   381点

c:\seisekikanri20221104\lesson01>java Sample1
成績管理

生徒番号        名前            国語    算数    合計
2022041001      織田信長        73点    96点    169点
2022041002      徳川家康        66点    92点    158点
2022041003      豊臣秀吉        63点    82点    145点
2022041004      上杉謙信        62点    96点    158点
2022041005      武田信玄        98点    91点    189点
                        合計    362点   457点

c:\seisekikanri20221104\lesson01>
*/

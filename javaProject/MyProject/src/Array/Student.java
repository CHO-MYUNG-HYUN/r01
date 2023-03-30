package Array;

public class Student {
	
	private String name;
	private int lang;
	private int eng;
	private int math;
	
	public Student(String name, int lang, int eng, int math) {
		super();
		this.name = name;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
	}
	
	private int sum() {
		return lang+eng+math;
	}
	
	private double avg() {
		return sum()/3.0;
	}
	
	public String result() {
		return name+"\t"+lang+"\t"+eng+"\t"+math+"\t"+sum()+"\t"+avg();
	}
	
	
	@Override
	public String toString() {
//		return "Student [name=" + name + ", lang=" + lang + ", eng=" + eng + ", math=" + math + "]";
		return result();
	}

	//getter
	public String getName() {
		return name;
	}
	public int getLang() {
		return lang;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}

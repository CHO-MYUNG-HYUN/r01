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
	
	public double getAvg() {
		return (lang+eng+math)/3.0;
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

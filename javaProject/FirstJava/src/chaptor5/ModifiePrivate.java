package chaptor5;

public class ModifiePrivate {
	
	private String name;
	private int age;
	
	public ModifiePrivate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void tell() {
		System.out.println(age+"살"+name+"입니다.");
	}
}

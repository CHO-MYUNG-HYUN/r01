package inherit;

public class Male extends Person {

	String boy;

	public Male(String name, String personId, String boy) {
		super(name, personId);
		this.boy = boy;
	}

	@Override
	void printHello() {
		super.printHello();
		System.out.println(boy + "입니다.");
	}
}

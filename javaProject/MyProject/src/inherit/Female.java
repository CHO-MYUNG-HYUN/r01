package inherit;

public class Female extends Person {

	String girl;

	public Female(String name, String personId, String girl) {
		super(name, personId);
		this.girl = girl;
	}

	@Override
	void printHello() {
		super.printHello();
		System.out.println(girl + "입니다.");
	}

}

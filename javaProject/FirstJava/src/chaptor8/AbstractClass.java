package chaptor8;

public abstract class AbstractClass {

	int num;
	String name;
	
	abstract void abstractMethod();
	
	void instanceMethod() {
		abstractMethod();
	}
	
	void printData() {
		System.out.println(name);
	}
}

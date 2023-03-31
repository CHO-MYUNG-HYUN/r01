package chaptor8;

public class Main {

	public static void main(String[] args) {

		AbstractClass abstractClass; // 상위타입
//		abstractClass = new AbstractClass();
		
//		abstractClass = new NewClass(); 협업할떄 미완성된 클래스를 사용
		NewClass class1 = new NewClass();
		class1.abstractMethod();
		class1.instanceMethod();
		class1.printData();
	}

}

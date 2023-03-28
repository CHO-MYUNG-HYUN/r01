package chaptor5;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
//		singleton = new Singleton(); 외부에서 인스턴스 생성 불가.
		singleton.printData();
	}
}

package chaptor7;

public class SmartPhone2 extends Phone {

	String model;
	
	//상위 클래스에 매개변수가 있느 생성자가 있다면 상위클래스의 멤버를
	//초기화 할 데이터를 받아서 상위클래스의 생성자를 호출해 줘야함.
	//현재 클래스의 멤버를 초기화 한다.
	public SmartPhone2(String phoneNumber, String model) {
		super(phoneNumber);
//		현재 클래스의 인스턴스 변수의 초기화 자리.
		this.model = model;
	}

	void game() {
		super.call();
		System.out.println(model + "게임한다");
	}
	
	
	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2("010", "ios");
		sp.game();
		
	}
}

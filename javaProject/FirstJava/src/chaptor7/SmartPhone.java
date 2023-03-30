package chaptor7;

public class SmartPhone extends Phone{
	
	//자식 클래스 : 좁은의미, 기능의 확장
	
	public SmartPhone(String phoneNumber) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
	}

	String model;
	
	void game() {
		System.out.println("게임");
	}
	
	private void mian() {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone(model);
		sp.phoneNumber = "010-7680-6161";
		sp.call();
		
		sp.model = "Google";
		sp.game();
	}
}

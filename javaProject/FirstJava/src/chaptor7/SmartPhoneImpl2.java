package chaptor7;

public class SmartPhoneImpl2 extends Phone {

	String model;

	public SmartPhoneImpl2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println(model +"이어팟 통화");
	}
	
	void playMusic() {
		System.out.println("음악을 재생");
	}

	public static void main(String[] args) {
		//다형성 : 상위타입의 참조변수에 다양한 하위변수의 인스턴스를 참조할수 있는것
		Phone p = new SmartPhoneImpl2("01011", "22");
		p.call();
		
		SmartPhoneImpl2 p2 = (SmartPhoneImpl2)p;
		p2.playMusic();
	}
}

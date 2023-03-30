package chaptor7;

public class SmartPhoneImpl extends Phone {

	String model;

	public SmartPhoneImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhoneImpl(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println("이어팟 통화");
	}

	public static void main(String[] args) {
		SmartPhoneImpl spi = new SmartPhoneImpl("10", "이어");

		spi.call();
	}
}

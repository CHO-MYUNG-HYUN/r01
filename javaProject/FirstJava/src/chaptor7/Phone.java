package chaptor7;

public class Phone {

	String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Phone() {}
	
	
	void call(){
	System.out.println(phoneNumber + "에서 전화를 걸어 통화를 합니다. ");
	}

}

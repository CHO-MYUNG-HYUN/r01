package chaptor8.phone;

public class Main {

	public static void main(String[] args) {

//		System.out.println(Phone.PHONE_NUM_3);
		
		Phone phone = new SmartPhone(); // = new 구현체 클래스();
//		Phone phone = null;
		
		//1 전원을 키고
		phone.trunOn();

		//2 통화
		phone.call();
		
		//3 전원 끄기
		phone.trunOff();
		
		Phone phone2 = new SmartPhone2();
		///////////////////////
		//1 전원을 키고
		phone2.trunOn();
		
		//2 전화를 걸고
		phone2.call();
		
		//3 게임을 한다
		((SmartPhone2)phone2).gamePlay();
		
		//4 전원을 끈다.
	}

}

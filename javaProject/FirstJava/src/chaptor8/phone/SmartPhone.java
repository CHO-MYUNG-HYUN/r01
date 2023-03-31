package chaptor8.phone;

public class SmartPhone implements Phone {

	boolean power; // false

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println("119");
	}

	@Override
	public void trunOn() {
		System.out.println("전원을 켭니다!");
		if (!power) {// 꺼져있는 상태
			power = true;
		}
	}

	@Override
	public void trunOff() {
		System.out.println("전원을 끕니다");
		if(power) {
			power = false;
		}

	}

}

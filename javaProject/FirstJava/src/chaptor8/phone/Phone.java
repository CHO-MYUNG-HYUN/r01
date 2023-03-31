package chaptor8.phone;

public interface Phone {

	//상수 : 값이 변하지 않는 변수 => 이후에는 값을 변경할 수 없다.
	//인터페이스 변수는 상수형태로만 구성.
	public static final int PHONE_NUM_1 = 1;
	//public static final 생략가능.
	int PHONE_NUM_2 = 2;
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 9;
	int PHONE_NUM_0 = 0;
	
	
	//추상메서드
	public abstract void call();
	void trunOn();
	void trunOff();
}

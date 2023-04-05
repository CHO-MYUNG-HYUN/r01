package chaptor11;

import chaptor8.Phone;
import chaptor8.SmartPhone;

public class GenericMethodByType2 {

	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		SmartPhone p = new SmartPhone("010", "ios");
		byType.<SmartPhone>introduce(p);
		byType.introduce(p);
		
//		byType.<String>introduce("1");
//		byType.<Integer>introduce(1);
//		byType.introduce("1");
//		byType.introduce(true);
	}
}

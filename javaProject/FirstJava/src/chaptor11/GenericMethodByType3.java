package chaptor11;

//import chaptor8.Phone;
import chaptor8.SmartPhone;
import chaptor8.phone.Phone;

public class GenericMethodByType3 {

	public void introduce(MyClass<? super SmartPhone> t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType3 byType = new GenericMethodByType3();
		
		MyClass<Phone> class1 = new MyClass<Phone>();
		class1.setVal(new chaptor8.phone.SmartPhone());
		
//		byType.introduce(class1);
		
		
		
		
		
		
		
		
//		SmartPhone p = new SmartPhone("010", "ios");
//		byType.<SmartPhone>introduce(p);
//		byType.introduce(p);
		
//		byType.<String>introduce("1");
//		byType.<Integer>introduce(1);
//		byType.introduce("1");
//		byType.introduce(true);
	}
}

package chaptor7;

public class ClassCasting2 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("안드로이드");
		IPhone iPhone = new IPhone("아이폰");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
	}
	
	public static void callByPhone (Phone p) {
		p.call();
	}
	
//	public static void callByPhone (AndroidPhone p) {
//		p.call();
//	}
//	
//	public static void callByPhone (IPhone p) {
//		p.call();
//	}
}

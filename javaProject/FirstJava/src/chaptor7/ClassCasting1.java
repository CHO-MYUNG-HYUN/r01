package chaptor7;

public class ClassCasting1 {

	public static void main(String[] args) {

		AndroidPhone androidPhone = new AndroidPhone("안드로이드폰");
		
		Phone phone = new AndroidPhone("!11");
		Phone p = new IPhone("아이폰");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone;//자식에서 부모로 타입변경시 생략가능. 즉 부모는 자식의 일을 처리할수 있따.

//		AndroidPhone phone3 = phone; 부모클래스가 자식클래스로 타입변경시.
		AndroidPhone phone3 = (AndroidPhone) phone;
//		AndroidPhone phone4 = (AndroidPhone) p;
		
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if (p instanceof IPhone) {
			iPhone = (IPhone)p;
			iPhone.call();
		}else if(p instanceof AndroidPhone) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}
	}

}

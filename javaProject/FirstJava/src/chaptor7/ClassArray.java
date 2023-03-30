package chaptor7;

public class ClassArray {

	public static void main(String[] args) {
		
		Phone[] phones = new Phone[5];
		
		phones[0] = new AndroidPhone("안드로이드 0번");
		phones[1] = new IPhone("아이폰 1번");
		phones[2] = new IPhone("아이폰 2번");
		phones[3] = new AndroidPhone("안드로이드 3번");
		phones[4] = new AndroidPhone("안드로이드 4번");
		
		for(Phone phone:phones) {
			phone.call();
		}

	}
}

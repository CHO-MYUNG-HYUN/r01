package chaptor5;

public class SmartPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone("red", 5.2f, 0);
		SmartPhone sp2 = new SmartPhone("gold", 4.5f);
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		
		SmartPhone sp3 = new SmartPhone();
		
		Member member = new Member("King", "king@gmail", 21, "010-00", sp2);
		printInfo(member);
	}
	
	static void printInfo(Member member) {
		member.showData();
	}

}

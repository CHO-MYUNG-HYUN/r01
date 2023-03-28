package chaptor5;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SmartPhone smartPhone = new SmartPhone();
		
		Member member1 = new Member("손흥민", "son@gmail", 20, "010-1111-9999", smartPhone);
		Member member2 = new Member("박지성", "park@gmail");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1);
//		printInfo(member1);
	}
	
	static void dataPrint(Member member) {
		member.showData();
	}

}

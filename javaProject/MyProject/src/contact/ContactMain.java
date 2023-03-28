package contact;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String modify = null;
		String tmp = null;
		Contact contact = Contact.getContact();

		System.out.print("이름\t>>");
		contact.setName(scanner.nextLine());
		System.out.print("전화번호\t>>");
		contact.setPhoneNumber(scanner.nextLine());
		System.out.print("이메일\t>>");
		contact.setEmail(scanner.nextLine());
		System.out.print("주소\t>>");
		contact.setAddress(scanner.nextLine());
		System.out.print("생일\t>>");
		contact.setBirthday(scanner.nextLine());
		System.out.print("그룹\t>>");
		contact.setGroup(scanner.nextLine());

		System.out.println("####################");

		contact.printContact();

		System.out.println("####################");

		System.out.print("수정할 항목 >>");
		modify = scanner.next();
		System.out.print("수정할 " + modify + " >>");
		tmp = scanner.next();
		switch (modify) {
		case "이름":
			contact.setName(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		case "전화번호":
			contact.setPhoneNumber(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		case "이메일":
			contact.setEmail(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		case "주소":
			contact.setAddress(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		case "생일":
			contact.setBirthday(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		case "그룹":
			contact.setGroup(tmp);
			System.out.println(modify + " 변경 완료");
			break;
		}

		System.out.println("####################");

		contact.printContact();

		scanner.close();
	}

}

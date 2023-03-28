package contact;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Contact contact = new Contact();
		
		System.out.print("이름\t>>");
		contact.setName(scanner.next());
		System.out.print("전화번호\t>>");
		contact.setPhoneNumber(scanner.next());
		System.out.print("이메일\t>>");
		contact.setEmail(scanner.next());
		System.out.print("주소\t>>");
		contact.setAddress(scanner.next());
		System.out.print("생일\t>>");
		contact.setBirthday(scanner.next());
		System.out.print("그룹\t>>");
		contact.setGroup(scanner.next());
		
		System.out.println("----------------------");
		
		contact.printData();
		

	}

}

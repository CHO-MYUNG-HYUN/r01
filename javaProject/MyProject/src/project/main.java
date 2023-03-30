package project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Contact contact = new Contact("조명현", "6161", "네이버", "별내동", "0310", "종로");
		
		SmartPhone smartPhone = new SmartPhone();
		for(int i = 0 ; i<10 ; i++) {
			smartPhone.saveContact(contact, i);
		}
		System.out.println("=========");
		for(int i = 0 ; i < 10; i++) {
			smartPhone.printContact(i);
		}
		
	}

}

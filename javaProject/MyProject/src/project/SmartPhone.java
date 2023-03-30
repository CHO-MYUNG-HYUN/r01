package project;

public class SmartPhone {

	Contact[] contacts = new Contact[10];
	
	void saveContact(Contact contact, int n) {
		contacts[n] = contact;
	}
	
	void deleteContact(Contact contact, int n) {
		contacts[n] = null;
	}
	
	void updateContact(Contact contact, int n) {
		contacts[n] = contact;
	}
	
	void printContact(int n) {
		System.out.println(contacts[n]);
	}
}

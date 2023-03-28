package contact;

public class Contact {

	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	Contact(){
		name = "미등록";
		phoneNumber = "미등록";
		email = "미등록";
		address = "미등록";
		birthday = "미등록";
		group = "미등록";
	}
	
	private static Contact contact = new Contact();
	
	public static Contact getContact() {
		if (contact == null) {
			contact = new Contact();
		}
		return contact;
	}
	
	public void printContact() {
		System.out.println("이름\t: " + getName());
		System.out.println("전화번호\t: " + getPhoneNumber());
		System.out.println("이메일\t: " + getEmail());
		System.out.println("주소\t: " + getAddress());
		System.out.println("생일\t: " + getBirthday());
		System.out.println("그룹\t: " + getGroup());
	}
	
	public void modifyContact() {
		
	}

	//getter
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getGroup() {
		return group;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public static void setContact(Contact contact) {
		Contact.contact = contact;
	}
	
	
}

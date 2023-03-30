package inherit;

public class Person {

	String name;
	String personId;

	public Person(String name, String personId) {
		super();
		this.name = name;
		this.personId = personId;
	}

	void printHello() {
		System.out.println("안녕하세요 저는 " + name + "입니다. " + age() + "살 입니다.");
	}

	int age() {
		int year = Integer.parseInt(personId.substring(0, 2));
		if (year > 23) { // 1900년대 출생
			return 2023 - (1900 + year) + 1;
		} else { // 2000년대 출생
			return 2023 - (2000 + year) + 1;
		}
	}

}

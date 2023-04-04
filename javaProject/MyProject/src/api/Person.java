package api;

import project.main;

public class Person {

	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {
	
		boolean result = false;
		
		//주민등록번호가 같으면 같은 인스턴스로 판별
		// 매개변수로 전달받은 obj를 person 타입으로 형변환->personNumber 비교후 반환.
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("son", "0310");
		Person p2 = new Person("asdn", "0310");
		System.out.println(p1.equals(p2));
		
	}
	
}

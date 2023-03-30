package inherit;

public class PersonMain {

	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		
		person[0] = new Person("조명현0", "990310-3XXXXXX");
		person[1] = new Male("조명현1", "000310-3XXXXXX", "남성");
		person[2] = new Female("조명현2", "010310-3XXXXXX", "여성");
		
		for (Person p:person) {
			p.printHello();
		}

	}

}

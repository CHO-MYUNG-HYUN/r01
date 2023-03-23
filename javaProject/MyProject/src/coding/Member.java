package coding;

public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "AG";
		int age = 23;
		double height = 180.2;
		boolean hasBook = true;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(hasBook);

	}
	
	static void vaccination(int year) {
		int age = 2023-year+1;
		if (age > 15 || age <=65){
			System.out.println("무료예방접종이 가능합니다.");
		}else {
			System.out.println("무료접종 대상이 아닙니다");
		}
	}
	
}
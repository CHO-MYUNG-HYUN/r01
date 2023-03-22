package test;

public class FirstJava {

	//메인 메서ㅡ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("First JAVA1");
//		System.out.println("First JAVA2");
//		System.out.println("First JAVA3");
//		System.out.println("First JAVA4");
		
		// 변수 : 메모리 공간 할당, 메모리 주소의 역할
		// 선언방법
		// 자료형타입 변수입 ;
		 
		//나이를 저장하는 변수를 선언
		int age; // 변수선언 : 나이 값을 저장 할수 있는 변수 선언
		age =20;
		
		// 원주율 : pi -> 3.14~
		double pi;
		pi=3.141592;
		
		System.out.println(age);
		System.out.println(pi);
		
		int resultValue = add(10, 20);
		System.out.println(resultValue);
		
		
	}
	
	// 정두 두개 받아 더하기 연산 결과 반환 메소드
	
	static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
		
	}

}

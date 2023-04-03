package chaptor9;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "String";
		String str2 = "String";// str1과 같은 주소값을 갖음.(같은 객체를 가르킴)
		String str3 = new String("String");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3); // 주소값 비교

		System.out.println(str1.equals(str3)); // 문자열 비교

		// 특정 타입의 데이터를 -> String 타입으로 변경
		String str4 = "" + 1;
		String str5 = String.valueOf(1);// 추천 방식
		String str6 = new String();
		System.out.println(str5.toString());

		String str = "hello~";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.length()); // 문자열의 길이 반환
		// index : 0 ~ str.length()-1
		
		// 반복문
		// 문자열 출력
		for(int i = 0; i < str1.length(); i ++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		//역순으로 출력
		for(int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// compareTo
		System.out.println(str.compareTo("hello~"));
		System.out.println(str.compareTo("hello~~"));
		System.out.println(str.compareTo("hello"));
		
		System.out.println(str);
		System.out.println(str.replace('l', '!')); 
		
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
	}

}

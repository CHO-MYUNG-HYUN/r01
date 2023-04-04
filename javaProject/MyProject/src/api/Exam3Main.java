package api;

import java.util.Scanner;

public class Exam3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력 >> ");
		String name = sc.nextLine();

		if (name.trim().isEmpty()) {
			System.out.println("공백입력은 허용하지 않습니다.");
		} else {
			
			if (checkName(name)) {
				System.out.println(name);
			} else {
				System.out.println("영문자 대문자와 소문자만 입력 가능합니다.");
			}
		}
	}

	// 전달받은 문자열이 영문자로 되어있는지 판별 : a~z, A~Z
	static boolean checkName(String name) {

		boolean result = true;

		// 전달받은 문자열중 영문자가 아닌 문자를 포함하고 있다면
		// result = false;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
				result = false;
				break;
			}
		}
		return result;
	}
	
}

package check;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("검진 대상자 체크");
		System.out.println("태어난 년도를 입력하세요 >>");
		
		int year = in.nextInt();
		
		vaccin2(year);
		
		in.close();
	}

	static void vaccin(int year) {
		int age = 2023 - year;

		if (age < 15 || age > 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
	}

	static void vaccin2(int year) {
		int age = 2023 - year + 1;
		
		if (age >= 20 && (2023+year)%2==0) {
			System.out.println("무료 검진 대상입니다.");

			if (age >= 40) {
				System.out.println("무료 암 검진 대상자 입니다.");
			}
		}else {
			System.out.println("올해는 무료 검진 대상이 아닙니다.");
		}
	}
}

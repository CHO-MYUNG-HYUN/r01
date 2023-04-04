package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력 >> ");
		String Id = sc.nextLine();

		try {
			if (Id.trim().isEmpty()) { // 공백 문자열 입력시
				BadInputException e = new BadInputException("공백 아이디 오류");
				throw e;
			} else if (!(BadInputException.checkId(Id))) { // 아이디 검증 오류시
				BadInputException e = new BadInputException("영문자와 숫자만 가능합니다.");
				throw e;
			} else {
				System.out.println(Id + "님 안녕하세요.");
			}
		} catch (BadInputException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("예기치 못한 오류 발생");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
		}

	}

}

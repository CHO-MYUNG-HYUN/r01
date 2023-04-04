package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthdayMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도 입력 >> ");
		
		try {
			int bYear = sc.nextInt();	
			System.out.println(bYear + "년 태어났습니다.");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch(Exception e) {
			System.out.println("알수 없는 오류가 발생했습니다.");
		}finally {
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
		}

	}

}

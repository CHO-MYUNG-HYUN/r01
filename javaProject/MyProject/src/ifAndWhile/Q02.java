package ifAndWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	input = new Scanner(System.in);
		
		System.out.println("num 값 입력 (int) >> ");
		int num = input.nextInt();
		
		if(num < 0) System.out.println("0미만");
		else if (num < 100) System.out.println("0이상 100미만");
		else if (num < 200) System.out.println("100이상 200미만");
		else if (num < 300) System.out.println("200이상 300미만");
		else System.out.println("300이상");
		input.close();
	}

}

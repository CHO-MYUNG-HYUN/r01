package ifAndWhile;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	input = new Scanner(System.in);
		
		System.out.println("num 값 입력 (int) >> ");
		int num = input.nextInt();
		
		if(num < 0) System.out.println("0미만");
		else {
			int n = num/100;
			switch(n) {
			case 0:System.out.println("0이상 100미만");break;
			case 1:System.out.println("100이상 200미만");break;
			case 2:System.out.println("200이상 300미만");break;
			default:System.out.println("300이상");
			
			}
		}
		input.close();
	}

}

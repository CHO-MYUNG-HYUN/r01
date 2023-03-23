package coding;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("a(정수) 값 입력 : ");
		int a = in.nextInt();
		System.out.print("b(정수) 값 입력 : ");
		int b = in.nextInt();
		plus(a,b);
		minus(a, b);
		multi(a,b);
		div(a, b);
		
		System.out.print("반지름(실수) 값 입력 : ");
		double r = in.nextDouble();
		System.out.println(pi1(r));
		System.out.println(pi2(r));
		
		in.close();
	}
	
	static void plus(int a, int b) {
		System.out.println(a+b);
	}
	
	static void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	static void multi(int a, int b) {
		System.out.println(a*b);
	}
	
	static void div(int a, int b) {
		System.out.println(a/b);
	}
	
	static double pi1(double r) {
		return 2 * r * Math.PI; 
	}
	
	static double pi2(double r) {
		return r*r*Math.PI;
	}
}

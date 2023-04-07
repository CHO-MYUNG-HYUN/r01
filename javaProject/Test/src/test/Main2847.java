package test;

import java.util.Scanner;

public class Main2847 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] points = new int[n];
		for(int i = 0; i <n; i++) {
			points[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		int minus = 0;
		
		for(int i = n-2; i>=0; i--) {
			if (points[i] > points[i+1]) {
				 minus = points[i] - points[i+1] +1;
				 points[i] -=minus;
				 sum +=minus;
			}
		}
		System.out.println(sum);
	}
	
}

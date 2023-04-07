package complete;

import java.util.Arrays;
import java.util.Scanner;

public class Main1929 { 
	//04월 07일 , 에라토스테네스의 체, 소수 찾기 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] prime = new boolean[N + 1];

		Arrays.fill(prime, true);

		prime[0] = false;
		prime[1] = false;

		for (int i = 2; i <= N; i++) {
			if (prime[i]) {
				for (int j = i + i; j <= N; j += i) {
					prime[j] = false;
				}
			}
		}

		for (int i = M; i <= N; i++) {
			if(prime[i]) {
				System.out.println(i);
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		int M = sc.nextInt();
//		int N = sc.nextInt();
//		
//		boolean[] prime = new boolean[N+1];
//		
//		Arrays.fill(prime, true);
//		
//		prime[0]= false;
//		prime[1]= false;
//		
//		for(int i = 2; i<= Math.sqrt(N); i++) {
//			if (prime[i]) {
//				for(int j = i*i; j<=N ; j+=i) {
//					prime[j] = false;
//				}
//			}
//		}
//		
//		for(int i = M ; i<=N; i++) {
//			if(prime[i]) {
//				System.out.println(i);
//			}
//		}
	}

}

package complete;

import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
//		int count = 0;
		int[] coins = new int[n];
		for(int i= 0; i<n; i++) {
			coins[i] = sc.nextInt();
		}
		
		int [] dp = new int[k+1];
		dp[0] = 0;
		for(int i=1; i<=k; i++) {
			dp[i] = 100001;
			for(int j = 0; j<n; j++);
		}
//		for(int i=n-1; i>=0; i--) {
//			count += k/coins[i];
//			k%=coins[i];
//		}
//		System.out.println(count);
	}
}

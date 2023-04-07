package complete;

import java.util.Arrays;
import java.util.Scanner;

public class Main2587 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int[] result = new int[5];
		for (int i = 0; i < 5; i++) {
			result[i] = sc.nextInt();
			sum += result[i];
		}
		Arrays.sort(result);
		System.out.println(sum / 5);
		System.out.println(result[2]);

	}

}

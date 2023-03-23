package ifAndWhile;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int sum = 0;
		while(true) {
			if (sum >= 1000) break;
			num++;
			
			if (num%2 == 1) {
				sum += num;
				continue;
			}
			if (num%3 ==0 && num%2 ==0) {
				sum += num;
			}
		}
		System.out.println(sum +" "+ num);
	}

}

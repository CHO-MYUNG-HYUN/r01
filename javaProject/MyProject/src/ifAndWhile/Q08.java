package ifAndWhile;

public class Q08 {
	
	public static void main(String[] args) {
		
		int i = 1000;
		int sum= 0;
		while(i > 0) {
			if (i % 7 == 0 && i % 2 == 0) {sum+=i;}
			i--;
		}
		System.out.println(sum);
	}
}

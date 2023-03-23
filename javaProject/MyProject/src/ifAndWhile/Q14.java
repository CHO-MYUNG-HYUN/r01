package ifAndWhile;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0; a<10; a++) {
			for(int b = 0; b<10; b++) {
				int top = a*10 + b;
				int bot = b*10 + a;
				if (top+bot == 99) {
					System.out.println(top +"+" + bot);
				}
			}
		}
	}

}

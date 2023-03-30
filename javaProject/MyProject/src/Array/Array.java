package Array;

public class Array {

	public static void main(String[] args) {

		int[][] Array = { 
				{ 100, 100, 100 }, { 90, 90, 90 },
				{ 100, 80, 90 }, { 49, 65, 85 }, 
				{ 78, 100, 100 }, { 54, 50, 38 }, 
				{ 100, 80, 82 }, { 100, 100, 100 }, 
				{ 100, 100, 100 }, { 100, 100, 100 } 
			};

		for (int i = 0; i < Array.length; i++) {
			double avg = 0;
			
			for (int j = 0; j < Array[i].length; j++) {
				avg += Array[i][j] / 3.0;
				System.out.print(Array[i][j] + "  ");
			}
			
			System.out.println(avg);
		}

	}

}

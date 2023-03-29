
package chaptor6;

public class ArrayTest4 {

	public static void main(String[] args) {

		int[][] arr;

		arr = new int[3][2];
		
		System.out.println(arr.length); //3
		
		System.out.println(arr[0].length); //2
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
	}

}

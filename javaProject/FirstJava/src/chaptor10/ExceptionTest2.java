package chaptor10;

public class ExceptionTest2 {

	public static void main(String[] args) {

		try {
			Exception e = new NullPointerException();
			throw e;
		}catch(NullPointerException e) {
			System.out.println("널포");
		}catch(Exception e) {
			System.out.println("예외처리");
		}

	}

}

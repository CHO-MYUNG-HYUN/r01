package exception;

public class BadInputException extends Exception{

	public BadInputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	static boolean checkId(String Id) {
		boolean chk = true;
		
		for (int i = 0; i<Id.length(); i++) {
			char c = Id.charAt(i);
			if (!(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9')) {
				chk = false;
				break;
			}
		}
		return chk;
	}
	
}

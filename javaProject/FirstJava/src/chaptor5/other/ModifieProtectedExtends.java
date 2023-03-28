package chaptor5.other;

import chaptor5.ModifieProtected;

public class ModifieProtectedExtends extends ModifieProtected {
	
	public static void main(String[] args) {
		
		ModifieProtectedExtends mpe = new ModifieProtectedExtends();
		
		mpe.name = "이강인";
		mpe.age = 20;
		
		mpe.tell();
	}

}

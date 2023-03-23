package chaptor2;

public class ByteOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터 범위에 따라 타입설정이 달라져야한다.
		// 0~270
		
		byte b = 0;
		int i = 0;
		
		// 0에서 1씩 더해서 270까지 증가
		for(int x =0; x<=270; x++) {
			System.out.println(b + "\t" +i);
			b++;
			i++;
		}
		
		
	}

}

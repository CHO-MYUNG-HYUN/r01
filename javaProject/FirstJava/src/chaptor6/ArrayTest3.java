package chaptor6;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성

		scores[0] = 640;
		scores[1] = 340;
		scores[2] = 380;
		scores[3] = 650;
		scores[4] = 920;
		scores[5] = 850;
		scores[6] = 730;
		scores[7] = 310;
		scores[8] = 170;
		scores[9] = 335;

		resultPrint(scores);
	}
	
	//점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) {
		//전달 받은 배열은 : int 타입의 배열이다! size 제약은없다.
		
		int sum = 0;
		float avg = 0.0f;
		for (int i = 0; i<arr.length; i++) {
			sum+= arr[i];
		}
		
		avg = sum/(float)arr.length;
		System.out.println("평균 : " + avg);
	}
	
}

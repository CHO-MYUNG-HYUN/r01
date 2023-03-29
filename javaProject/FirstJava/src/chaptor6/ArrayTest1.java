package chaptor6;

public class ArrayTest1 {

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

		int sum = 0;

		float avg = 0.0f;

		for (int i = 0; i < 10; i++) {
			System.out.println(scores[i]);
			sum+=scores[i];
		}
		
		avg = sum/(float)scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}

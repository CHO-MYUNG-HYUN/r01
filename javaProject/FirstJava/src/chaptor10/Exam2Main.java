package chaptor10;

public class Exam2Main {

	public static void main(String[] args) {

		//1 ~ 100,000,000 더하기 연산의 시간 측정
		
		//시작시간
		long startTime = System.currentTimeMillis(); //
		
		//처리
		long sum = 0;
		for(int i = 1; i<=100000000;i++) {
			sum +=i;
		}
		
		//종료시간
		long endTime = System.currentTimeMillis();
		
		//종료시간 - 시작시간
		long result = endTime - startTime;
		System.out.println(result);

	}

}

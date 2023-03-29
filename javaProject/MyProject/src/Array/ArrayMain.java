package Array;

public class ArrayMain {

	public static void main(String[] args) {

		Student[] student = new Student[10];
		student[0] = new Student("가", 10 ,11 ,12);
		student[1] = new Student("나", 20 ,22 ,22);
		student[2] = new Student("다", 30 ,31 ,32);
		student[3] = new Student("라", 40 ,41 ,42);
		student[4] = new Student("마", 50 ,51 ,52);
		student[5] = new Student("바", 60 ,61 ,62);
		student[6] = new Student("사", 70 ,71 ,72);
		student[7] = new Student("아", 80 ,81 ,82);
		student[8] = new Student("자", 90 ,91 ,92);
		student[9] = new Student("차", 99 ,100 ,100);
		
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i].getName() + "의 평균 점수 : " + student[i].getAvg());
		}
	}

}

package chaptor5;

public class SmartPhone {

	String color; // 속성 : 스마트폰의 색상
	float size; // 속성 : 스마트폰의 사이즈
	int volume; // 속성 : 음량 크기
	// 초기화에 필요한 데이터를 받기 위해 매개변수를 정의한 생성자

	public SmartPhone(String color, float size, int volume) { // 색상, 사이즈, 볼륨크기 값을 받아 초기화
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	public SmartPhone(String color, float size) {
		this.color = color;
		this.size = size;
	}
	
	public SmartPhone() {
		this.color = "red";
		this.size = 10.5f;
		this.volume = 0;
	}

	void call() { // 기능 : 전화걸기
		System.out.println("전화걸기");
	}

	void volumeUp() { // 기능 : 음량 키우기
		volume += 1;
	}

	void volumeDown() { // 기능 : 음량 낮추기
		volume -= 1;
	}

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone("red", 5.1f, 10);
		System.out.println("색상은 : " + sp.color);
	}

}

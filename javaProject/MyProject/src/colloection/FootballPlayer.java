package colloection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FootballPlayer {

	String name;
	int number;
	String team;
	int age;

	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {

		FootballPlayer FP = null;
		if (obj != null && obj instanceof FootballPlayer) {
			FP = (FootballPlayer) obj;
			if (team.equals(FP.team) && name.equals(FP.name) && age == FP.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	
	
	public static void main(String[] args) {

		//List 인스턴스 저장 및 출력
		List<FootballPlayer> list = null;
		list = new LinkedList<FootballPlayer>();

		list.add(new FootballPlayer("1번선수", 1, "종로", 99));
		list.add(new FootballPlayer("2번선수", 1, "종로", 20));
		list.add(new FootballPlayer("3번선수", 1, "종로", 20));
		list.add(new FootballPlayer("1번선수", 2, "종로", 99)); // 중복발생.
		list.add(new FootballPlayer("2번선수", 1, "압구정", 20));

		for (FootballPlayer FP : list) {
			System.out.println(FP);
		}

		System.out.println("######################");

		//List에 저장된 인스턴스를 equals를 이용하여 중복 제거.
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				} // if end
			} // for end
		} // for end

		for (FootballPlayer FP : list) {
			System.out.println(FP);
		}
		
		System.out.println("######################");
		
	}// main end
}

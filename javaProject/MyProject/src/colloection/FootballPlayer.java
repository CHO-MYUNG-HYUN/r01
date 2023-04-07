package colloection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer implements Comparable<FootballPlayer>{

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
	public int hashCode() {
		return this.team.charAt(0)+this.name.charAt(0);
	}
	
	@Override
	public int compareTo(FootballPlayer o) {
		return team.compareTo(o.team);
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		// List 인스턴스 저장 및 출력
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

		// List에 저장된 인스턴스를 equals를 이용하여 중복 제거.
		System.out.println("=============List_equals=======================");
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

		
		
		
		
		
		// Set을 이용하여 저장 후 출력
		System.out.println("===========HashSet===================");
		HashSet<FootballPlayer> hashSet = null;
		hashSet = new HashSet<>();
			
		hashSet.add(new FootballPlayer("1번선수", 1, "종로", 99));
		hashSet.add(new FootballPlayer("2번선수", 1, "종로", 20));
		hashSet.add(new FootballPlayer("3번선수", 1, "종로", 20));
		hashSet.add(new FootballPlayer("1번선수", 2, "종로", 99)); // 중복발생.
		hashSet.add(new FootballPlayer("2번선수", 1, "압구정", 20));

		for (FootballPlayer FP : hashSet) {
			System.out.println(FP);
		}

		
		
		
		
		
		//TreeSet을 이용한 정렬 
		System.out.println("==========TreeSet============================");
		TreeSet<FootballPlayer> treeSet = null;
		treeSet = new TreeSet<FootballPlayer>();
		
		treeSet.add(new FootballPlayer("손흥민", 1, "타_유럽", 90));
		treeSet.add(new FootballPlayer("박지성", 5, "하_은퇴", 50));
		treeSet.add(new FootballPlayer("이강인", 81, "타_미국", 46));
		treeSet.add(new FootballPlayer("차범근", 43, "가_독일", 66));
		treeSet.add(new FootballPlayer("김민재", 92, "타_미국", 48));

		for(FootballPlayer fp : treeSet) {
			System.out.println(fp);
		}
		
		
		
		
		
		
		//Map을 이용
		System.out.println("=========Map==============");
		FootballPlayer fp1 = new FootballPlayer("손흥민", 1, "유럽", 90);
		FootballPlayer fp2 = new FootballPlayer("박지성", 5, "은퇴", 50);
		FootballPlayer fp3 = new FootballPlayer("이강인", 81, "미국", 46);
		FootballPlayer fp4 = new FootballPlayer("차범근", 43, "독일", 66);

		HashMap<Integer, FootballPlayer> hashMap= null;
		hashMap = new HashMap<>();
		
		hashMap.put(fp1.number, fp1);
		hashMap.put(fp2.number, fp2);
		hashMap.put(fp3.number, fp3);
		hashMap.put(fp4.number, fp4);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()) {
//			Integer keyInt = (Integer)itr.next();
//			System.out.println(hashMap.get(keyInt));
			System.out.println(hashMap.get((Integer)itr.next()));
		}

	}// main end


}

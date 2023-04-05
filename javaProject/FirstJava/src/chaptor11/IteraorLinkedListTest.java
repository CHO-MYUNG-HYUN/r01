package chaptor11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteraorLinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		
		Iterator<Integer> itr = numbers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		System.out.println("#################");
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
		
		//Collection<E> => List<E> => ArrayList<E>
		//String타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조값을 저장
		LinkedList<String> list = new LinkedList<String>();
		
		//인스턴스 저장 add()
		list.add("손흥민");
		list.add(new String("박지성"));
		list.add(new String("이강인"));
		
		//데이터 참조 get()
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("------------------");
		list.add(1, "안정환");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		//저장된 요소의 개수 : size()
		System.out.println("저장된 요소의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size()-1));
		
		
		System.out.println("==========");
		//반복문을 이용해서 일관 처리
		for(int i = 0; i<list.size(); i ++) {
			System.out.println(list.get(i) +" "+ list.get(i).charAt(0));
		}
		
		System.out.println("---------------");
		for(String playerName : list) {
			System.out.println(playerName + " " + playerName.charAt(2));
		}
		
		System.out.println("================");
		if(list.contains("손흥민")) {
			System.out.println("잘하자 화이팅");
		}
		
		if(list.contains("안정환"));{
			list.remove("안정환");
			list.remove(0);
		}
		
		System.out.println("---------------");
		for(String playerName : list) {
			System.out.println(playerName + " " + playerName.charAt(2));
		}
		
		//전체 요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
	}

}

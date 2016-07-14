package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();

		set.add("둘리");
		set.add("마이콜");
		set.add("도우넛");
		System.out.println(set.size());

		set.add("마이콜");  //중복되는 값 삽입
		set.add("도우넛");
		System.out.println(set.size());
		
		System.out.println(set.contains("마이콜"));  //'마이콜'이라는 값이 들어가 있는가?
		System.out.println(set.contains("고길동"));
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
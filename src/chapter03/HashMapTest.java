package chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("�Ѹ�", new Integer(100));
		map.put("�Ѹ�", 100); //auto boxing
		
		map.put("������", 50);
		map.put("�����", 80);
		
		int score = map.get("������");	 //auto unboxing
		System.out.println(score);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			
			System.out.println("key: "+key+", value: "+value);
		}
	}

}
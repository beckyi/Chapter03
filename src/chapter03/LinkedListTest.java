package chapter03;

import java.util.List;
import java.util.LinkedList;


public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("�Ѹ�");
		list.add("������");
		list.add("�����");
		list.add("��浿");

		list.remove(1);

		int count = list.size();

		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}

}

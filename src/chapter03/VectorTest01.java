package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection Framework가 없었던 1.2 시절
		Vector<String> vector = new Vector<String>(); //제너릭<>을 이용 
		vector.addElement("둘리");
		vector.addElement("마이콜");
		vector.addElement("도우넛");
		vector.addElement("고길동");
		
		vector.removeElement("마이콜");
		
		//순회1
		int size = vector.size();
		for(int i=0; i<size; i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		//순회2
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}

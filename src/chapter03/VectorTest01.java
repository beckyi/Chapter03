package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection Framework�� ������ 1.2 ����
		Vector<String> vector = new Vector<String>(); //���ʸ�<>�� �̿� 
		vector.addElement("�Ѹ�");
		vector.addElement("������");
		vector.addElement("�����");
		vector.addElement("��浿");
		
		vector.removeElement("������");
		
		//��ȸ1
		int size = vector.size();
		for(int i=0; i<size; i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		//��ȸ2
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}

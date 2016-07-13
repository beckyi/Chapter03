package chapter03;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10,20);
		Point p2 = new Point(50,100);
		Point p3 = p1;
		
		// Object�� �⺻ �޼��� �׽�Ʈ
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());	//�ؽ� - �ּҸ� �������� �ٲپ���
		System.out.println(p1.toString());	// 16������ ���
		System.out.println(p1); // 16������ ���
		
		String s = new String("Hello");
		System.out.println(s.toString());	// (�������̵�)�ؽ����� �ƴ� (����)���� ���
		
		// == -> ��ü�� ��쿡�� ������ ��ü ����(���ϼ�)
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		// equals -> ��ü�� �����(���)
		Point p4 = new Point(10,20);
		
		System.out.println(p1 == p4);
		System.out.println(p1.equals(p4));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	// ���� ��
		
		//�������̵� �ϱ� �� �ؽ��ڵ� ��ȣ ���
		System.out.println(System.identityHashCode(p1));
	}

}

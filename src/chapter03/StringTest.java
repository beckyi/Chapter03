package chapter03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "He\"llo\" \tWorld\n";
		char c = '\'';
		String ss = null;
		
		System.out.println(s);
		System.out.println(c);
		
		//+ ����
		System.out.println("Hello"+"World");	//hello ��ü ����
		System.out.println(new StringBuffer("Hello").append("World"));
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		sb.append(2);
		
		System.out.println(sb);
		
//		System.out.println("hello".equals(ss));
//		System.out.println(ss.equals("hello"));	//����

		
	}

}

package chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "������";
		int score = 100;
		
		System.out.println(name+", "+score);
		System.out.println(String.format("�л� %s�� �ڹٽ�����  %d�� �޾ҽ��ϴ�.", name, score));
		
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
//		Formatter fm = new Formatter(new StringBuffer());
		System.out.println(fm.format("�л� %s�� �ڹٽ����� %d�� �޾ҽ��ϴ�.",name,score));
	}

}

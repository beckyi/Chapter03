package chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "최재은";
		int score = 100;
		
		System.out.println(name+", "+score);
		System.out.println(String.format("학생 %s는 자바시험을  %d점 받았습니다.", name, score));
		
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
//		Formatter fm = new Formatter(new StringBuffer());
		System.out.println(fm.format("학생 %s는 자바시험을 %d점 받았습니다.",name,score));
	}

}

package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(now));
		//�޼��� ���(deprecated)
		printDate(now);
		
		Date d = new Date();
		printDate(d);
	}

	public static void printDate(Date date) {
		System.out.print((date.getYear() + 1900) + "��");
		System.out.print((date.getMonth() + 1) + "��");
		System.out.print(date.getDate() + "��");
		System.out.print(date.getHours() + ":");
		System.out.print(date.getMinutes() + ":");
		System.out.print(date.getSeconds());
		System.out.println("");
	}

}

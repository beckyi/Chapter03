package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		Integer i = new Integer(10);
		
		//UnBoxing
		int j = i.intValue();
		
		System.out.println(i+","+j);
		
		//Auto Boxing
		Integer i2 = 10;
		
		//Auto UnBoxing
		int j2 = i+ 10;	//int j2 = i.intValue() + 10;
	}

}

package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] src = {0, 1, 2, 3, 4, 5};
		ByteArrayInputStream bais = new ByteArrayInputStream(src);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//내부에서 버퍼링 할당하므로 목적지가 없어도 됨.
		
		int data = -1;	//비어있는 상태
		while((data = bais.read()) != -1){
//			System.out.println(data);
			baos.write(data);
		}
		byte[] dest = baos.toByteArray();
		
		System.out.println(Arrays.toString(src)); 	//배열에 있는 값을  String으로 바꾸어줌
		System.out.println(Arrays.toString(dest));
		
	}

}

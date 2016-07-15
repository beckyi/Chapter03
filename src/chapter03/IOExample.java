package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] src = {0, 1, 2, 3, 4, 5};
		ByteArrayInputStream bais = new ByteArrayInputStream(src);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//���ο��� ���۸� �Ҵ��ϹǷ� �������� ��� ��.
		
		int data = -1;	//����ִ� ����
		while((data = bais.read()) != -1){
//			System.out.println(data);
			baos.write(data);
		}
		byte[] dest = baos.toByteArray();
		
		System.out.println(Arrays.toString(src)); 	//�迭�� �ִ� ����  String���� �ٲپ���
		System.out.println(Arrays.toString(dest));
		
	}

}

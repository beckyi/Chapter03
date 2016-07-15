package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
	static FileInputStream fis = null;
	static FileOutputStream fos = null;

	public static void main(String[] args) {
		try {
			fis = new FileInputStream("puppy.jpg");
			fos = new FileOutputStream("puppy2.jpg");

			int data = -1;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("������ ã�� �� �����ϴ�.: " + e);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ڿ����� (���� �ݱ�)
			try{
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}

	}

}

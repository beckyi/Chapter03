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
			System.out.println("파일을 찾을 수 없습니다.: " + e);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리 (파일 닫기)
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

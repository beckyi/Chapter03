package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr =new FileReader("test.txt");
			
			int data = -1;	//4byte
			while((data = fr.read()) != -1){	//2byte¾¿ ÀÐ¾î¿È
				System.out.print((char) data );
			}
			
			fr.close();
			
			System.out.println("");
			
			FileInputStream fis = new FileInputStream("test.txt");
			while((data = fis.read()) != -1){	//1byte¾¿ ÀÐ¾î¿È - ±ÛÀÚ°¡ ±úÁü.
				System.out.print((char)data);
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}

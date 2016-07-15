package chapter03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("./src/chapter03/LineNumberReaderTest.java");
			LineNumberReader lnr = new LineNumberReader(fr);
			
			String s = null;
			int index = 0;
			
			while((s = lnr.readLine()) != null){
				String line = String.format("%3d: %s", lnr.getLineNumber(), s);	//¡Ÿ ê¨√ƒ¡÷±‚
				System.out.println(line);

			}
			
			lnr.close(); //«œ≥™∏∏ ¥›æ∆µµ ¥Ÿ ¥›»˚!
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}

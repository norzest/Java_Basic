package java_20210520;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(
					"C:\\Users\\dark1\\Downloads//HoaxEliminator4.15.zip");
			fw = new FileWriter(
					"C:\\\\Users\\\\dark1\\\\eclipse-workspace\\\\Java_Fundamental\\\\src\\\\java_20210518\\\\test//reader_test.txt");
			
//			int readChar = 0;
//			while((readChar = fr.read()) != -1) {
//				fw.write(readChar);
//			}
			
			int readCharCount = 0;
			char[] readChars = new char[1024*10];
			while((readCharCount = fr.read(readChars)) != -1) {
				fw.write(readChars, 0, readCharCount);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}

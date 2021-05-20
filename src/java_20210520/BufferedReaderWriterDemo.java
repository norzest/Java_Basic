package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518//FileDemo.java");
			fw = new FileWriter(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210520\\test//br_test.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				bw.write(readLine); // readLine 변수에는 개행 포함 x
				bw.newLine(); // 개행
			} bw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	} // main
} // class

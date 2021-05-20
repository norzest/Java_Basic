package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518//FileDemo.java");
			fw = new FileWriter(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210520\\test//pw_test.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw, true);
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				pw.println(readLine); // printwriter는 flush랑 개행 안해도 알아서 해줌
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}

package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream psf = null; // 파일
		PrintStream psm = System.out; // 모니터
		
		psm.println("asdf");
		
		try {
			fis = new FileInputStream(
					"C:\\Users\\dark1\\Downloads//HoaxEliminator4.15.zip");
			fos = new FileOutputStream(
					"C:\\\\Users\\\\dark1\\\\eclipse-workspace\\\\Java_Fundamental\\\\src\\\\java_20210518\\\\test//buffer_test.zip");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			psf = new PrintStream(bos, true);
			
			int readByte = 0;
			while((readByte = bis.read()) != -1 ) {
				psf.write(readByte);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) bis.close();				
				if (fis != null) fis.close();				
				if (bos != null) bos.close();
				if (fos != null) fos.close();				
				if (psf != null) psf.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	} // main
} // class

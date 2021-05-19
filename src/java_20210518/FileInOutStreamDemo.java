package java_20210518;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(
					"C:\\Users\\dark1\\Downloads\\eclipse-jee-2021-03-R-win32-x86_64//eclipse-jee-2021-03-R-win32-x86_64.zip");
			fos = new FileOutputStream(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518\\test//eclipse_copy.txt");
			
			long start = System.currentTimeMillis();
			
// 			read method
//			int readByte = 0;
//			while((readByte = fis.read()) != -1) {
//				fos.write(readByte);
//			}
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*100];
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			
			long end = System.currentTimeMillis();
			System.out.println((end - start)/1000);
		} catch(Exception e) {// file not found, IO
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();				
				if (fos != null) fos.close();				
			} catch(Exception e) {// IO
				e.printStackTrace();
			}
		}
	}
}

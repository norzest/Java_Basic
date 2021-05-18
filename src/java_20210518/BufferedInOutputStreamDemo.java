package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(
					"C:\\Users\\dark1\\Downloads//HoaxEliminator4.15.zip");
			fos = new FileOutputStream(
					"C:\\\\Users\\\\dark1\\\\eclipse-workspace\\\\Java_Fundamental\\\\src\\\\java_20210518\\\\test//buffer_test.zip");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			int readByte = 0;
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println((end - start)/1000);
			// stream chaining 으로 인해 속도가 빨라짐
			// buffer 공간에 바이트를 쌓아 놓다가 buffer가 전부 차면 write한다.
			// 마지막에 buffer 공간이 결국 전부 차지 않기 때문에 용량이 조금 줄어든다
			// 따라서 이를 방지하기 위해 flush 매서드를 한번 사용한다.
			// 근데 더빠른게 있어서 잘안씀(fileinoutstream의 방법 사용)
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) bis.close();				
				if (fis != null) fis.close();				
				if (bos != null) bos.close();
				if (fos != null) fos.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

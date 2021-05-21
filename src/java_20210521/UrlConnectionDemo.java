package java_20210521;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args)
			throws IOException {
		URL url = new URL(
				"https://imgnews.pstatic.net/image/139/2021/05/21/0002151130_001_20210521154203930.jpg?type=w647");
		URLConnection urlCon = url.openConnection();
		
		String cacheControl = urlCon.getHeaderField("cache=control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cache-control: " + cacheControl);
		System.out.println("content-type: " + contentType);
		System.out.println("date: " + date);
		
		try {
			InputStream is = url.openStream();
			//InputStreamReader isr = new InputStreamReader(is);
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\dark1\\Downloads\\test.jpg");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			while((readByteCount = is.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			} fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // main
} // class

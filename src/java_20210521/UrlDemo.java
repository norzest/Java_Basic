package java_20210521;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args)
			throws MalformedURLException {
		URL url = new URL("https://imgnews.pstatic.net/image/139/2021/05/21/0002151130_001_20210521154203930.jpg?type=w647");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println(protocol);
		System.out.println(host);
		System.out.println(port);
		System.out.println(path);
		System.out.println(query);
		System.out.println(ref);
		
		try {
			// 이미지 파일이라 byte 형식으로 바꾸기 - outputstream (html 은 string이 좋음 - writer)
			InputStream is = url.openStream();
			//InputStreamReader isr = new InputStreamReader(is);
			//BufferedReader br = new BufferedReader(isr);
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

package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		// Socket 객체를 생성하기 위해 ServerSocket 사용
		ServerSocket serverSocket = null;
		
		for(int port = 1; port < 65536; ++port) {
			try {
				serverSocket = new ServerSocket(port);
				//System.out.println(port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(port + "사용중");
			} // catch
		}
	}
}

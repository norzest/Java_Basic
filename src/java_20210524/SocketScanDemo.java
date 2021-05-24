package java_20210524;

import java.io.IOException;
import java.net.Socket;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		
		for (int port = 1; port <= 1024; ++port) {
			try {
				socket = new Socket("127.0.0.1", port);
				System.out.println(port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(port + "막힘");
			} // catch
		} // for

	
	} // main
} // class

package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;
	public EchoServer2(int port) {
		this.port = port;
	}
	
	public void run() {
		EchoServerThread est = null;
		ServerSocket serverSocket = null;
		
		try {
			// 1. server socket 생성
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println(port);
		} // catch
		
		System.out.println("[서버]");
		System.out.println("클라이언트 접속 대기중");
		while(true) {
			try {
				// 2. 클라이언트 접속 대기 (accept)
				// 클라이언트가 접속 하면 통신할 수 있는 socket 객체 생성
				Socket socket = serverSocket.accept();
				
				est = new EchoServerThread(socket);
				Thread t = new Thread(est);
				t.start();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // run
	
	public static void main(String[] args) {
		new EchoServer2(3000).run();
	}
}

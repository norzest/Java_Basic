package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoServerThread implements Runnable {
	private Socket socket;
	public EchoServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			// 4 . 클라이언트와 통신할 수 있는 socket 객체 생성
			InetAddress i = socket.getInetAddress();
			System.out.println("클라이언트 접속[" +
			i.getHostAddress() + "]");
			
			// 5. socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);

			while(true) {
				String readLine = br.readLine();
				System.out.println("message: " + readLine);
				
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
			}
		} catch(IOException e) {
			System.err.println("비정상적인 클라이언트 종료");
		}
		
	} // run
} // class
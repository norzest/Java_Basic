package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo1 {
	public static void m(String path)
			throws FileNotFoundException {
		FileReader fr = new FileReader("");
	}
	
	public static void main(String[] args) {
		
		try {
			m(args[0]);
		} catch(FileNotFoundException e) {
			e.printStackTrace(); // 개발자용 출력
			System.err.print("사용자용 출력");
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 개발자용 출력
			System.err.print("사용자용 출력");
		}
	}
}

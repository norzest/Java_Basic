package java_20210608;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\dark1\\www/test.html");
		
		System.out.println(f.length()/1024);
		
		String fileName = f.getName();
		System.out.println(fileName);

		String name = fileName.substring(0, fileName.lastIndexOf("."));
		System.out.println(name);
		
		System.out.println(f.getParent());
		
		String temp = "asd.asd.dasddd";
		String[] arr = temp.split("\\.");
		for(String tt : arr) {
			System.out.println(tt);
		}
	}
}

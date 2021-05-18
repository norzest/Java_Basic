package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd a hh:mm");
		return sdf.format(cal.getTime());
	}
	
	public static void main(String[] args) {
		File f1 = new File(
				"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518\\test");
		if(f1.mkdirs()) {
			System.out.println("만듬");
		} else {
			System.out.println("이미 있음");			
		}
		System.out.println("====================");
		
		File f2 = new File(
				"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518\\test//text.txt");
		long len = f2.length();
		System.out.printf("%,d \n", len);
		System.out.println("====================");
		
		boolean isFile = f2.isFile();
		if(isFile) {
			String path = f2.getPath();
			System.out.println(f2);
			System.out.println("파일");
		} else {
			System.out.println("파일 아니고 디렉토리");
		}
		System.out.println("====================");
		
		File f3 = new File(
				"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518\\test//text2.txt");

		File f4 = new File(
				"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518\\test//text2_2.txt");	
		f3.renameTo(f4);
		
		String path = f4.getPath();
		String parent = f4.getParent();
		String name = f4.getName();
		System.out.printf("%s\n%s\n%s\n", path, parent, name);
		System.out.println(format(f2));
		System.out.println("====================");
		
		File f5 = new File(
				"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210518");
		File[] file = f5.listFiles();
		for(File value : file) {
			if(value.isDirectory()) {
				System.out.printf("%s, %s\n", value.getName(), format(value));
			} else {
				System.out.printf("%s, %d Byte \n", value.getName(), value.length());				
			}
		}
	} // main
} // class

package java_20210511.prc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StopWatch_basic {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, 
	IllegalAccessException, 
	IOException {
/*
		File file = new File("C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210511\\prc\\class.properties");
		FileReader reader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(reader);
		
		String clazz = properties.getProperty("class.name");
		Class c = Class.forName(clazz);

		StopWatchManager ss = (StopWatchManager) c.newInstance(); 
		//run(ss);
*/
		StopWatchManager s = StopWatchManager.getInstance();
		
		long l = 380000000; // for루프 할 횟수 설정
		s.run(new MilliS(l));
		s.run(new MicroS(l));
		s.run(new NanoS(l));
		
		
	} // main
} // class
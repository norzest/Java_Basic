package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d %d %d\n", year, month, day);
		System.out.printf("%d %d %d\n", hour, minute, second);

	
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss E");
		
		System.out.println(sdf.format(cal.getTime()));
		cal.set(2020, 4, 12);
		System.out.println(sdf.format(cal.getTime()));
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
	}
}

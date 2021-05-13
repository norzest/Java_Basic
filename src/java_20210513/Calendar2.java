package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar2 {
	private Calendar cal;
	public Calendar2() {
		cal = Calendar.getInstance();
	}
	
	// 연도만 주어졌을 시 모든 월의 달력 출력
	public void calendar_print(int year) {
		for (int i = 1; i <= 12; ++i) {
			calendar_print(year, i);
		} // for i
	} // calendar_print year

	// 해당 월의 달력 출력
	public void calendar_print(int year, int month) {		
		System.out.println(month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		cal.set(year, month-1, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
		
		for (int i = 0; i < dayOfWeek; ++i) { // 시작 요일을 1일로 맞추기 위해 탭 추가
			System.out.print("\t");
		} // for i
		
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); ++i) {
			System.out.print(i + "\t");
			
			// 토요일 나왔으면 개행
			if ((dayOfWeek + i - 1) % 7 == 6) {
				System.out.println();
			} // if
		} // for i
		System.out.printf("\n\n");
		
	} // calendar_print year, month

	// 년, 월, 일 모두 주어졌을 시 무슨 요일인지 출력
	public void calendar_print(int year, int month, int day) {
		cal.set(year, month-1, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-DD HH:mm:ss E");
		
		//요일 출력
		System.out.println(sdf.format(cal.getTime()));

	} // calendar_print year, month, day

} // class


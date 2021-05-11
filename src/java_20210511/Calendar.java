package java_20210511;

public class Calendar {
	private String[] day_of_the_week = {"일", "월", "화", "수", "목", "금", "토"};
	private int[] month_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int year;
	private int month;
	private int day;
	
	
	public Calendar() {
		
	}
	
	public Calendar(int year) {
		this(year, 0, 0);
	}

	public Calendar(int year, int month) {
		this(year, month, 0);
	}
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// 윤년 확인
	private boolean isLeafYear(int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	} // isLeafYear
	
	// 윤년일시 2월 29일 추가
	private void LeafYear_change(int year) {
		if (isLeafYear(year)) {
			month_day[1] = 29;
		} else {
			month_day[1] = 28;
		}
	} // LeafYear_change
	
	// 1년 1월 1일부터 해당 날짜까지의 총 일수 합
	private int get_total_day(int year, int month, int day) {
		//년수 합계 (년수-1)*365 만큼 더한 후, 윤년을 추가로 더한다.
		//단, 100의 배수 년은 빼고 400의 배수 년은 다시 더한다.
		int temp = year - 1;
		int sum = temp*365
				  + temp/4
				  - temp/100
				  + temp/400;

		//월수 합계
		LeafYear_change(year);
		for (int i = 0; i < month-1; ++i) {
			sum += month_day[i];
		} // for i
				
		//일수 합계
		sum += day;
		
		return sum;
	} // total_day
	
	public void calendar_print() {
		if (this.day == 0) {
			if (this.month == 0) {
				calendar_print(this.year);				
			} else {
				calendar_print(this.year, this.month);
			}
		} else {
			calendar_print(this.year, this.month, this.day);			
		}
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
		
		// n년 n월 1일의 요일 구하기 day_of_the_weeks[tab]
		int tab = get_total_day(year, month, 1) % 7;
		
		for (int i = 0; i < tab; ++i) { // 시작 요일을 1일로 맞추기 위해 탭 추가
			System.out.print("\t");
		} // for i
		
		for (int i = 1; i <= month_day[month-1]; ++i) {
			System.out.print(i + "\t");
			
			// 토요일 나왔으면 개행
			if ((tab + i - 1) % 7 == 6) {
				System.out.println();
			} // if
		} // for i
		System.out.printf("\n\n");
		
	} // calendar_print year, month

	// 년, 월, 일 모두 주어졌을 시 무슨 요일인지 출력
	public void calendar_print(int year, int month, int day) {
		int total = get_total_day(year, month, day);
				
		//요일 출력
		System.out.println(day_of_the_week[total % 7]);

	} // calendar_print year, month, day

} // class

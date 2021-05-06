package java_20210430;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		scan.close();
		String day_of_the_week = "";
		

		day_of_the_week = calendar(year, month, day);
		
		System.out.printf("%d년 %d월 %d일 %s요일", year, month, day, day_of_the_week);

	} // main
	
	static String calendar(int y, int m, int d) {
		String[] day_of_the_weeks = {"일", "월", "화", "수", "목", "금", "토"};
		int[] month_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	
		//년수 합계 (년수-1)*365 만큼 더한 후, 윤년을 추가로 더한다.
		//단, 100의 배수 년은 빼고 400의 배수 년은 다시 더한다.
		int temp = y - 1;
		int sum = temp*365
				  + temp/4
				  - temp/100
				  + temp/400;

		//월수 합계
		if (y%4==0 && y%100!=0 || y%400==0) {
			month_day[1] += 1; // 윤년일시 2월 29일 추가
		} // if
		for (int i = 0; i < m-1; ++i) {
			sum += month_day[i];
		} // for i
				
		//일수 합계
		sum += d;
				
		//요일 리턴
		return day_of_the_weeks[sum % 7];
	} // calendar

} // class

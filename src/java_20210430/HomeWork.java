package java_20210430;

public class HomeWork {

	public static void main(String[] args) {
		int year = 2021;
		int month = 4;
		int day = 30;

		//년수 합계
		int temp = year - 1;
		int sum = temp*365 +
				temp/4 - // 2020년까지 윤년 더하기
				temp/100 + // 2020년까지 100의 배수 제외
				temp/400; // 400의 배수는 다시 추가

		//월수 합계
		if (month >= 2) { sum += 31; }
		if (month >= 3) { sum += 28; }
		if (month >= 4) { sum += 31; }
		if (month >= 5) { sum += 30; }
		if (month >= 6) { sum += 31; }
		if (month >= 7) { sum += 30; }
		if (month >= 8) { sum += 31; }
		if (month >= 9) { sum += 31; }
		if (month >= 10) { sum += 30; }
		if (month >= 11) { sum += 31; }
		if (month >= 12) { sum += 30; }
		if (year%4==0 && year%100!=0 || year%400==0) {
			sum += 1; // 윤년일시 2월 29일 추가
		}
		
		//일수 합계
		sum += day;
		
		//요일 구하기
		int result = sum % 7;
		String day_message = "";
		if (result == 1) { day_message = "월"; }
		if (result == 2) { day_message = "화"; }
		if (result == 3) { day_message = "수"; }
		if (result == 4) { day_message = "목"; }
		if (result == 5) { day_message = "금"; }
		if (result == 6) { day_message = "토"; }
		if (result == 0) { day_message = "일"; }
		System.out.printf("%d년 %d월 %d일 %s요일", year, month, day, day_message);
	}

}

package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		// Run configurations -> arguments -> program arguments
		// int month = Integer.parseInt(args[0]);
		int month = 5;
		String season = "";

		
		switch (month) {
		case 12, 1, 2: season = "겨율"; break;
		case 3, 4, 5: season = "봄"; break;
		case 6, 7, 8: season = "여름"; break;
		case 9, 10, 11: season = "가을"; break;
		default: season = "없는 계절";
		}

		System.out.println(season);

	}

}

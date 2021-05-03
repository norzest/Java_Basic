package java_20210430;

public class SSnDemo {

	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;

		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 1;
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 + a6*7 +
				b1*8 + b2*9 + b3*1 + b4*2 + b5*3 + b6*4 + b7*5;
		
		if ((11 - (sum % 11)) % 10 == b7) System.out.println("정상");
		else System.out.println("비정상");
		
	}

}

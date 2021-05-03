package java_20210503;

public class BreakDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; ++i) {
			if (i==6) break;
			sum += i;
		} // for i
		System.out.println(sum);
		
		
		outer :
		for (int i = 2; i <= 9; ++i) {
			for (int j = 1; j <= 9; ++j) {
				if (i==4 && j==8) break outer;
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			} // for j
		} // for outer
		
	} // main

} // class

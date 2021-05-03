package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i+=2) {
			sum += i;
		} // for i
		
		System.out.println(sum);
		
		for (int i = 2; i <= 9 ; ++i) {
			for (int j = 1; j <= 9; ++j) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			} // for j
		} // for i
		
		int cnt = 99; // 2부터 100까지 수
		for (int i = 2; i <= 100; ++i) {
			for (int j = 2; j <= i/2; ++j) {
				if (i % j == 0) { cnt--; break; } // 소수가 아니면 갯수 차감
			} // for j
		} // for i
		
		System.out.println(cnt);

	} // main

} // class

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
		
		
		
		int n = 100;
		int cycle_num = 0;
		int cnt = 99; // 2부터 n까지 수
		int total = (n * (n + 1) / 2) - 1; // 2부터 n까지 합계
		for (int i = 2; i <= n; ++i) {
			for (int j = 2; j*j <= i; ++j) {
				cycle_num++;
				if (i % j == 0) { // 소수가 아니면 갯수, 합 차감
					total -= i;
					cnt--; break;
				} // if
			} // for j
		} // for i
		
		System.out.println(cycle_num);
		System.out.printf("total: %d, cnt: %d", total, cnt);

	} // main
	

} // class

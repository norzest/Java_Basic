package java_20210503;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		} // while i

		System.out.println(sum);
		
		
		int a = 2, b = 1;
		
		while (a <= 9) {
			while(b <= 9) {
				System.out.printf("%d * %d = %d\n", a, b, a*b);
				b++;
			} // while b
			a++; b = 1;
		} // while a
	}

}

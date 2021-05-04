package java_20210430;

public class OperatorDemo {

	public static void main(String[] args) {
		int a = 10, b = 23;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);
		System.out.println(((double)b/a));

		a += b;
		System.out.println(a);
		
		System.out.println(a++);
		System.out.println(++b);
		
		
		System.out.println(1 == 2);
		System.out.println(true && false);
		System.out.println(true); // == true || false
		
		
		System.out.println(0b11 | 0b01);
		System.out.println(0b11 & 0b01);
		System.out.println(0b11 ^ 0b01);

	}

}

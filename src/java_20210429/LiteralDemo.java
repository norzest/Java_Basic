package java_20210429;

public class LiteralDemo {

	public static void main(String[] args) {
		//byte b1 = 128;
		int a1 = 128;
		int a2 = 076;
		int a3 = 0x123;
		int a4 = 0b111;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		long a5 = 2200000000l;
		
		int a6 = 1_000_000;
		
		float f1 = 1234.43f;
		
		double d1 = 1234.45;
		
		boolean isExited = true;
		
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(isExited);
	}

}

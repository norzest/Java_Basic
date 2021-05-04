package java_20210430;

public class CastingDemo {

	public static void main(String[] args) {
		byte b1 = (byte)129;
		System.out.println(b1);
		
		int i1 = (int)129.25;
		System.out.println(i1);
		
		double d1 = 124.5f;
		System.out.println(d1);
		
		byte b2 = 20;
		byte b3 = 20;
		byte b4 = (byte)(b2 + b3);
		int b5 = b2 + b3;
		System.out.println(b4);
		System.out.println(b5);

		System.out.println(1 + 2 + 3 + "abc");
		System.out.println("abc" + 1 + 2 + 3);
		System.out.println("abc" + (1 + 2 + 3));
		
		String str1 = "abc" + 1 + 2;
		String str2 = 1 + 2 + "abc";
		System.out.print(str1 + str2);
	}

}

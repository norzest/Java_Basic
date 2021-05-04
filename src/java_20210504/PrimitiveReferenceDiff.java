package java_20210504;

public class PrimitiveReferenceDiff {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 30;
		System.out.println(a);
		System.out.println(b);
		
		int[] aa = {10, 10};
		int[] bb = aa;
		aa[0] = 30;
		System.out.println(aa[0]);
		System.out.println(bb[0]);
		
	}

}

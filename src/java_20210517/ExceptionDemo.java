package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i = Integer.parseInt("1111a");
		System.out.println(i);
		
		int[] a = {1, 2, 3, 4};
		System.out.println(a[4]);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		System.out.println(list.get(1));
		
		String str = null;
		System.out.println(str.length());
		
		int x = 10;
		int y = 0;
		System.out.println(x/y);
	}
}

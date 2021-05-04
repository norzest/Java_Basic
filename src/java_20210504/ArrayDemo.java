package java_20210504;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr1 = new int[4];
		
		for (int i = 1; i <= arr1.length; ++i) {
			arr1[i-1] = i * 100;
		} // for i
		
		for (int i = 0; i < arr1.length; ++i) {
			System.out.println(arr1[i]);
		} // for i
		
		int[] arr2 = {100, 200, 300, 400};
		for (int i = 0; i < arr2.length; ++i) {
			System.out.println(arr2[i]);
		} // for i
		
	} // main

} // class

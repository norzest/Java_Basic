package java_20210504;

public class TwoArrayDemo {

	public static void main(String[] args) {
		int[][] arr = {{10, 20}, {30, 40}, {50 ,60}};
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			} // for j
			System.out.println();
		} // for i

		System.out.println();
		
		for (int[] i : arr) {
			for (int j : i) {				
				System.out.print(j + " ");
			} // for j
			System.out.println();
		} // for i

	
	} // main

} // class

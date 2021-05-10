package java_20210510;

public class CallByValueRefDemo {
	public static void main(String[] args) {
		int i = 10;
		int[] j = {1, 2, 3, 4};
		int[] array = {2, 4, 6, 1, 7, 2, 0};
		
		System.out.println(i + ", " + j[3]);
		change(i, j);
		System.out.println(i + ", " + j[3]);
		
		bubble_sort(array);
		for (int value : array) {			
			System.out.println(value);
		}
	}
	
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}
	
	public static void bubble_sort(int[] arr) {
		for (int j = 0; j < arr.length; ++j) { // bubble sort
			for (int k = 0; k < arr.length-j-1; ++k) {
				if (arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				} // if
			} // for k
		} // for j

	}
}

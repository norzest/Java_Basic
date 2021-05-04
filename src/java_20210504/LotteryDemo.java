package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		int n = 6;
		int[] arr = new int[n];
		
		int i = 0;
		while(arr[n-1] == 0) { // 중복값을 제외한 랜덤함 1~44까지의 수
			int temp = (int)(Math.random() * 45);
			
			boolean isOverlap = false;
			for (int j = 0; j < n; ++j) {
				if(arr[j] == temp) {
					isOverlap = true; break;
				} // if overlap
			} // for j
			
			if(!isOverlap) {
				arr[i++] = temp;
			} // if is overlap
		} // while
		
		for (int j = 0; j < n; ++j) {
			System.out.print(arr[j] + " ");
		} // for j
		System.out.println();
		
		
		
		System.out.print("퀵: ");
		int[] arr_temp = arr;
		quick_sort(arr_temp, 0, arr_temp.length-1);

		for (int j = 0; j < n; ++j) {
			System.out.print(arr_temp[j] + " ");
		} // for j
		System.out.println();
		
		
		
		for (int j = 0; j < n; ++j) { // bubble sort
			for (int k = 0; k < n-1; ++k) {
				if (arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				} // if
			} // for k
		} // for j
		
		System.out.print("버블: ");
		for (int j = 0; j < n; ++j) {
			System.out.print(arr[j] + " ");
		}

	} // main
	
	public static void quick_sort(int[] arr, int left, int right) {
		
		if (left < right) {
			int pivot = partition(arr, left, right);
			
			quick_sort(arr, left, pivot-1);
			quick_sort(arr, pivot+1, right);
		}
		
	} // quick_sort
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right)/2];
		
		while (left < right) {
			while (arr[left] < pivot && left < right) {
				left++;
			}
			
			while (arr[right] > pivot && left < right) {
				right--;
			}
			
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return right;
	} // partition

} // class

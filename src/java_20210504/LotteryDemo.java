package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		int n = 6;
		int[] arr = new int[n];
		
		int i = 0;
		while(arr[n-1] == 0) { // 중복값을 제외한 랜덤함 1~44까지의 수
			int temp = (int) (Math.random() * 45);
			
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
			System.out.println(arr[j]);
		}
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
		
		for (int j = 0; j < n; ++j) {
			System.out.println(arr[j]);
		}

	} // main

} // class

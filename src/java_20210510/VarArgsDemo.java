package java_20210510;

public class VarArgsDemo {

	public static void main(String[] args) {
		VarArgsDemo v = new VarArgsDemo();
		
		long s1 = v.sum(10, 20);
		long s2 = v.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(s1);
		System.out.println(s2);
		
	} // main
	
	public long sum(int... temp) {
		long sum = 0;
		
		for (int i = 0; i < temp.length; ++i) {
			sum += temp[i];
		}
		
		return sum;
	} // sum
	
} // class

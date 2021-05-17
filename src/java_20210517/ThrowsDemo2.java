package java_20210517;

public class ThrowsDemo2 {
	
	public static double getAverage(int[] exam) 
			throws ArrayIndexOutOfBoundsException,
			NullPointerException {
		int korean = exam[0];
		int math = exam[1];
		int english = exam[2];
		int history = exam[3];
		
		return (korean + math + english + history) / 4;
	}
	
	public static void main(String[] args) {
		int[] exam = {10, 20, 30};
		
		try {
			double avg = getAverage(exam);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.print("사용자용 출력");
		} catch(NullPointerException e) {
			System.err.print("사용자용 출력");
		}
		
	} // main
} // class

package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int a, int b) {
		return a+b/2;
	}
	
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			
			double average = getAvgs(korean, english);
			
			System.out.println(average);
		} catch(NumberFormatException a) {
			//a.printStackTrace();
			System.out.println(a.getMessage());
		} catch(ArrayIndexOutOfBoundsException a) {			
			System.err.print("에러");
		} finally {
			System.out.println("무조건 수행되는 블럭");
		}
		
	} // main
} // class

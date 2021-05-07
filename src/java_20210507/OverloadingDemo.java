package java_20210507;

public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo ovrd = new OverloadingDemo();
		
		ovrd.print(3);
		ovrd.print("삼");
		ovrd.print(true);
		ovrd.print(3, "삼");

	}
	
	public void print(int i) {
		System.out.println("int: " + i);
	}

	public void print(String str) {
		System.out.println("string: " + str);
	}

	public void print(boolean b) {
		System.out.println("boolean: " + b);
	}

	public void print(int i, String str) {
		System.out.println("int: " + i);
		System.out.println("string: " + str);
	}

	
	

}

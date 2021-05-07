package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interest_rate;
	
	public void m1() {
		System.out.println("인스턴스 메소드 m1");
	} // m1
	
	public void m2() {
		this.name = "심영효"; // == name="심영효";
		StaticMethodDemo.interest_rate = 3.4; // == interest_rate = 3.4;
		m1();
		m3();
	} // m2
	
	public static void m3() {
		System.out.println("스태틱 메소드 m3");
	} // m3
	
	public static void m4() {
		// name = "심영효";
		interest_rate = 3.5;
		// m1();
		m3();
	} // m4
	
	public static void main(String[] args) {
		// m2();
		m3();
		m4();

		StaticMethodDemo smd = new StaticMethodDemo();
		smd.name = "심영효";
		smd.m1();
		smd.m2();

	}

}
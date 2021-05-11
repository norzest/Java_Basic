package java_20210511;

public class Sub extends Super {
	String chicken;
	
	public Sub() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	

	@Override
	public void play(String game) {
		System.out.println("Sub play() 호출");
	}
}

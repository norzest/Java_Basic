package java_20210510;

public class AdminDemo {

	public static void main(String[] args) {
		Admin a = new Admin("asdf", "1q2w3e4r!@",
				"dark1203@naver.com", 3);
		
		print(a);
		
	} // main
	
	public static void print(Admin a) {
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	} // print

} // class

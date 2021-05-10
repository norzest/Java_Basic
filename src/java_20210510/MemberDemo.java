package java_20210510;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("심영효");
		m.setEmail("dark1203@naver.com");
		m.setZipcode("09876");
		m.setAddr1("경기도");
		m.setAddr2("안산시");
		m.setAge(30);
			
		print(m);
	}
	
	public static void print(Member m) {
		System.out.println(m.getName());
		System.out.println(m.getEmail());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getAge());
	}
}

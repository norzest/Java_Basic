package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] main) {
		char c1 = '심';
		char c2 = '영';
		char c3 = '효';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '\uac00';
		char c5 = '\ub098';
		char c6 = '\ub2e4'; 
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		char c10 = '\"';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		System.out.println("아이디\t이름\t지역");
		System.out.println("asdf\t홍길동\t경기");
		System.out.println("안녕하세요\n안녕안녕하세요");
	}
}

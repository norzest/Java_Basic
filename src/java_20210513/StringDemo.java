package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char[] c = {'h', 'e', 'l', 'l', 'o'};
		String str = new String(c);
		
		char c1 = str.charAt(1);
		System.out.println(c1);
		
		str = str.concat("123");
		System.out.println(str);
		
		str = new String("abc.zip");
		if(str.endsWith("zip")) {
			System.out.println("압축");
		} else if(str.endsWith("doc")) {
			System.out.println("워드");
		} else {
			System.out.println("파일");			
		}
		
		str = new String("asdqwe");
		if(str.startsWith("asd")) {
			System.out.println("asd 시작");
		} else {
			System.out.println("??");
		}

		str = new String("  asd    ");
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		
		// getBytes -> 문자열을 바이트 배열로 변환하는 함수
		str = new String("안녕하세요.");
		System.out.println(str.getBytes().length);
		
		str = new String("111111-111118");
		System.out.println(str.indexOf("-"));
		
		str = new String("a.b.c.zip");
		int lastIndex = str.lastIndexOf(".");
		System.out.println(lastIndex);
		System.out.println(str.substring(0, lastIndex));
		System.out.println(str.substring(lastIndex));
		
		str = new String("010-3333-4444");
		String[] strr = str.split("-");
		System.out.println(strr[0]);
		System.out.println(strr[1]);
		System.out.println(strr[2]);
		System.out.println(str.replace("0", "1"));
		System.out.println(str.replaceAll("111", "010"));
		
		str = new String("aBc");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		double d = 123456.123;
		String m = String.format("%,.2f", d);
		System.out.println(m);
	} // main
} // class

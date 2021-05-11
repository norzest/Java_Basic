package java_20210511;

public class SubDemo {
	
	public static void main(String[] args) {
		
		Sub s = new Sub();		
		Super s2 = new Super();		
		Super s3 = new Sub();		
		Object obj = new Sub();
		
		s.play("s");
		s2.play("s");
		s3.play("s");
		System.out.println(s3.toString());
		System.out.println(obj.toString());
	}
	
	
}

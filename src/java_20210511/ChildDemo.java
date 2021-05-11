package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		Child child = new Child();
		Child child2 = new Child("010-1234-1234", 33, 33);
		Child child3 = new Child("심영효", "경기", 26,
				"010-1234-1234", 33, 33);

		
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child2.phone);
		System.out.println(child2.weight);		
		System.out.println(child3.phone);
	}
	
	
}

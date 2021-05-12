package java_20210512;
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		
		int i = list.get(0);
		
		System.out.println(i);
		
		
		//Java 5.0 이전
		
		ArrayList list2 = new ArrayList();
		
		list2.add(new Integer(1));
		
		Integer temp = (Integer)list2.get(0);
		
		int i2 = temp.intValue();
		
		System.out.println(i2);
		
		
		int p = 10;
		// primitive => wrapper class
		Integer w = Integer.valueOf(p);
		// wrapper class => primitive
		int p2 = w.intValue();
		
		System.out.println(p+w+p2);
		
		// String => primitive
		String str = "10";
		int i3 = Integer.parseInt(str);
		System.out.printf("%d\n", i3);
	}
}

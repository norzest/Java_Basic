package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("1");
		set.add("33");
		set.add("15");
		set.add("27");
		set.add("1");
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		// tree set은 오름차순 정렬
		TreeSet set2 = new TreeSet();
		set2.add("1");
		set2.add("33");
		set2.add("15");
		set2.add("27");
		set2.add("1");
		
		Iterator i2 = set2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	
	} // main
} // class

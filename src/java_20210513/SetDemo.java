package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
		System.out.println();
		
		// linked는 fifo 방식 사용
		LinkedHashSet set3 = new LinkedHashSet();
		set3.add("1");
		set3.add("33");
		set3.add("15");
		set3.add("27");
		set3.add("1");

		Iterator i3 = set3.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		System.out.println();
		
		
		// compareTo 테스트
		// hashset은 데이터의 중복을 equals 로 판단
		// treeset은 compareto로 판단
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		
		HashSet st = new HashSet();
		st.add(s1);
		st.add(s2);
		
		TreeSet st2 = new TreeSet();
		st2.add(s1);
		st2.add(s2);
		
		System.out.println(st.size());
		System.out.println(st2.size());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
	} // main
} // class

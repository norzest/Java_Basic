package java_20210504;
import java.util.TreeSet;
import java.util.Iterator;


public class LotteryDemo2 {

	public static void main(String[] args) {
		int n = 6;
		TreeSet<Integer> set = new TreeSet<>();

		while (set.size() < n) {
			set.add((int)(Math.random() * 45));
		} // while set insert
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	} // main	

} // class

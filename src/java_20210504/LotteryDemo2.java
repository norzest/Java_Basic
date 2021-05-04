package java_20210504;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class LotteryDemo2 {

	public static void main(String[] args) {
		int n = 6;
		HashSet<Integer> set = new HashSet<>();

		while (set.size() < n) {
			set.add((int)(Math.random() * 45));
		} // while set insert
		
		List<Integer> set_list = new ArrayList<>(set);
		Collections.sort(set_list);

		System.out.println(set_list);
		
	} // main	

} // class

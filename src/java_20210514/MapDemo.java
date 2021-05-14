package java_20210514;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(1, "test");
		map.put("asd", 2);
		
		System.out.println(map.get(1));
		System.out.println(map.get("asd"));
		System.out.println("================");
		
		Iterator i = map.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(map.get(i.next()));
		}
	}
}

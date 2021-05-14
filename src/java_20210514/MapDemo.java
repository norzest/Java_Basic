package java_20210514;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("qwe", "test");
		map.put("asd", "test2");
		
		System.out.println(map.get("qwe"));
		System.out.println(map.get("asd"));
		System.out.println("================");
		
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(map.get(i.next()));
		}
	}
}

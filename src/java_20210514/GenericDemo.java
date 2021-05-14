package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		// 컬렉션의 자료형이 동일하지 않을 시 
		// 해당 객체들을 다시 호출할 시 에러가 날 확률이 높다.
		ArrayList<Integer> list = new ArrayList<>();
		
		//list.add("a");
		list.add(3);
		list.add(4);
		
		
		for (int value : list) {
			System.out.println(value);
		}
		
		
	} // main
} // GenericDemo

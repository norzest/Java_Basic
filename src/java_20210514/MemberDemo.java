package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {

		MemberManager m = new MemberManager();
		
		m.insert("asd", "홍길동", 33);
		m.insert("qwe", "홍길동2", 333);
		m.insert("zxc", "홍길동3", 3333);
		m.insert("rfv", "홍길동4", 33333);
		
		Member member = m.select("name", "홍길동2");
		System.out.printf("%s %s %d \n",
				member.getId(), member.getName(), member.getAge());

		System.out.println("======================");

		
		ArrayList<Member> list = m.select();
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s %s %d \n",
					list.get(i).getId(),
					list.get(i).getName(),
					list.get(i).getAge());
		}
		
		System.out.println("======================");
		
		m.delete("asd");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s %s %d \n",
					list.get(i).getId(),
					list.get(i).getName(),
					list.get(i).getAge());
		}
		
		System.out.println("======================");
		
		m.update("홍길동2", "홍길동7");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s %s %d \n",
					list.get(i).getId(),
					list.get(i).getName(),
					list.get(i).getAge());
		}

	} // main
} // class

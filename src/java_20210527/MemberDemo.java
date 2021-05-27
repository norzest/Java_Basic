package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		ArrayList<MemberDto> arr = null;
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto(12, "홍길동12", "한국");
		int start = 0;
		int len = 4;
		
		if(dao.insert(dto)) {
			arr = dao.select(start, len);
			for(int i = 0; i < arr.size(); ++i) {
				MemberDto temp = arr.get(i);
				System.out.printf("%d %s %s\n",
						temp.getNum(), temp.getName(), temp.getAddr());
			}
		} else {			
			System.out.println("안됌");
		} System.out.println();
		
		dto.setNum(12);
		dto.setName("홍길동13");
		dto.setAddr("북한");
		if(dao.update(dto)) {
			arr = dao.select(start, len);
			for(int i = 0; i < arr.size(); ++i) {
				MemberDto temp = arr.get(i);
				System.out.printf("%d %s %s\n",
						temp.getNum(), temp.getName(), temp.getAddr());
			}
		} else {			
			System.out.println("안됌");
		} System.out.println();
	
		
		if(dao.delete(12)) {
			arr = dao.select(start, len);
			for(int i = 0; i < arr.size(); ++i) {
				MemberDto temp = arr.get(i);
				System.out.printf("%d %s %s\n",
						temp.getNum(), temp.getName(), temp.getAddr());
			}
		} else {			
			System.out.println("안됌");
		} System.out.println();
	
		
	} // main
} // class

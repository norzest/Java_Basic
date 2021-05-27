package java_20210527;

import java.util.ArrayList;

public class DeptDemo {
	private void printArr(boolean success, DeptDao dao, int start, int len) {
		ArrayList<DeptDto> arr = null;
		
		if (success) {
			arr = dao.select(start, len);
			for(int i = 0; i < arr.size(); ++i) {
				DeptDto temp = arr.get(i);
				System.out.printf("%d %s %s\n",
						temp.getNo(), temp.getName(), temp.getLoc());
			}			
		} else {
			System.out.println("안됌");
		} System.out.println();
	}
	
	// main
	public static void main(String[] args) {
		DeptDemo dpt = new DeptDemo();
		DeptDao dao = DeptDao.getInstance();
		int start = 0;
		int len = 5;
		

		dpt.printArr(dao.insert(
				new DeptDto(50, "TEST", "TTTT")), dao, start, len);
		
		dpt.printArr(dao.update(
				new DeptDto(50, "AESA", "AAAA")), dao, start, len);
				
		dpt.printArr(dao.delete(50), dao, start, len);

	} // main
} // class

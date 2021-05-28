package java_20210528;

import java.util.ArrayList;


public class EmpDemo {
	private void printArr(boolean success, EmpDao dao, int start, int len) {
		ArrayList<EmpDto> arr = null;
		
		if (success) {
			arr = dao.select(start, len);
			for(EmpDto temp : arr) {
				System.out.printf("%d %s %s %d %s %.0f %.0f %d\n",
						temp.getNo(), temp.getName(), temp.getJob(), temp.getMgr(),
						temp.getHiredate(), temp.getSal(), temp.getComm(), temp.getDeptNo());
			}			
		} else {
			System.out.println("안됌");
		} System.out.println();
	}
	
	public static void main(String[] args) {
		EmpDemo emp = new EmpDemo();
		EmpDao dao = EmpDao.getInstance();
		EmpDto dto = new EmpDto(9003, "KIM", "MANAGER", 7839,
				null, 50000.0, 40000.0, 30);
		int start = 0;
		int len = 5;
		
		emp.printArr(true, dao, start, len);
	
	}
}

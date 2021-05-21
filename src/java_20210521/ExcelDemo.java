package java_20210521;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {
		// 새 엑셀 파일 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 새 시트 생성
		HSSFSheet sheet = workbook.createSheet("새파일");
		HSSFRow row = null;
		HSSFCell cell = null;

		// (row 숫자, cell 숫자)
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(0, 0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(0, 1)");		
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(0, 2)");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(1, 0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(1, 1)");		
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(1, 2)");
		
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(
					"C:\\Users\\dark1\\eclipse-workspace\\Java_Fundamental\\src\\java_20210521//excel_test.xls");			
			workbook.write(fos);
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(workbook != null) workbook.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	
	} // main
} // class

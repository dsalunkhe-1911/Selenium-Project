package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritee {
	public static void main(String[] args) throws IOException {
		
		//path excel
		File path=new File("E:\\Velocity.xlsx");
		
		//load file
		FileInputStream load=new FileInputStream(path);
		
		//workbook Access
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		
		FileOutputStream input=new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("TestNg");
	    workbook.write(input);
	}
}

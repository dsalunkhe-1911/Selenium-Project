package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_WriteUtility {
	public String excelReading(int sheetNo,int rowValue,int cellValue)throws IOException{
	    File path=new File("E:\\Velocity.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		XSSFSheet sheet1=workbook.getSheetAt(sheetNo);
		return sheet1.getRow(rowValue).getCell(cellValue).getStringCellValue();
		
	}
		public void excelwrite(int sheetNo,int rowValue,int cellValue,String data)throws IOException{
		File path=new File("E:\\Velocity.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		FileOutputStream input=new FileOutputStream(path);
		sheet1.createRow(1).createCell(1).setCellValue(data);
	    workbook.write(input);
		
}
  
  public static void main(String[] args)throws IOException{
	  ExcelRead_WriteUtility  exRead= new ExcelRead_WriteUtility();
	  System.out.println(exRead.excelReading(0, 0, 0));
	  System.out.println(exRead.excelReading(0, 0, 1));
	  System.out.println(exRead.excelReading(0, 0, 2));
	  
	  exRead.excelwrite(0,1,1,"Maven");
  }
}



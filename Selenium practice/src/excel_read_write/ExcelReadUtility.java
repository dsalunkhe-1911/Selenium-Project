package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
  public String excelReading(int sheetNo,int rowValue,int cellValue)throws IOException{
	    File path=new File("E:\\Velocity.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		XSSFSheet sheet1=workbook.getSheetAt(sheetNo);
		return sheet1.getRow(rowValue).getCell(cellValue).getStringCellValue();
  }
  
  public static void main(String[] args)throws IOException{
	  ExcelReadUtility xx= new ExcelReadUtility();
	  System.out.println(xx.excelReading(0, 0, 0));
	  System.out.println(xx.excelReading(0, 0, 1));
	  System.out.println(xx.excelReading(0, 0, 2));
  }
}

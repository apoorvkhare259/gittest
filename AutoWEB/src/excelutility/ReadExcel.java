package excelutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	private static XSSFSheet Excelsheet;
	private static XSSFWorkbook Excelbook;
	private static XSSFCell Cell;
	
	
	public static void setExelfile(String Path, String SheetName) throws IOException {
		
		
		FileInputStream Excelfile= new FileInputStream(Path);
		Excelbook = new XSSFWorkbook(Excelfile);
		Excelsheet= Excelbook.getSheet(SheetName);
		
		
	}
	
	 //In this we are passing parameters/arguments as Row Num and Col Num
    public static String getCellData(int RowNum, int ColNum) throws Exception{
    	  Cell = Excelsheet.getRow(RowNum).getCell(ColNum);
          String CellData = Cell.getStringCellValue();
          return CellData;
    	}
		
	

}

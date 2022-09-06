package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead { 
	static FileInputStream file;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static String readStringData(int i, int j) throws IOException  {
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFile\\LoginDetails.xlsx");
		w = new XSSFWorkbook(file);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static String readIntegerData(int i, int j) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFile\\LoginDetails.xlsx");
		w = new XSSFWorkbook(file);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);
	}

}

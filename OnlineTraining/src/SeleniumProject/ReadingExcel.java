package SeleniumProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of the excel
		File src = new File("C:\\Aswini\\Online_Training\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		
		//Load Work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFSheet ds = wb.getSheet("Sheet2");
		
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//Get first row cell value
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		
		//Get the Cell count
		System.out.println(sh.getTabColor());
		
		//Print float/Double from Excel
		System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
		
		//Print int from Excel
		System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());
		
//		System.out.println(sh.get);
		
	}

}

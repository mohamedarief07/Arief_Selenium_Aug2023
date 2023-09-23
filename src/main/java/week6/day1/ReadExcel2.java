package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {
		String sheetname = "Sheet1";
		
		
		XSSFWorkbook book = new XSSFWorkbook("testdata/dynamictestdata.xlsx");

		
		XSSFSheet sheet = book.getSheet(sheetname);

		int rowNum = sheet.getLastRowNum();

		short cellNum = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= rowNum; i++) {

			XSSFRow eachrow = sheet.getRow(i);

			for (int j = 0; j < cellNum; j++) {

				String eachCelValue = eachrow.getCell(j).getStringCellValue();

				System.out.println(eachCelValue);

			}

		}
	}

}

package week7.day1.POM;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData(String excelName) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("testdata/"+excelName+".xlsx");

		XSSFSheet sheet = book.getSheetAt(0);

		int rowNum = sheet.getLastRowNum();

		short cellNum = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowNum][cellNum];

		for (int i = 1; i <= rowNum; i++) {

			XSSFRow eachrow = sheet.getRow(i);

			for (int j = 0; j < cellNum; j++) {

				String eachCelValue = eachrow.getCell(j).getStringCellValue();

				System.out.println(eachCelValue);
				data[i - 1][j] = eachCelValue;

			}

		}

		book.close();

		return data;

	}

}

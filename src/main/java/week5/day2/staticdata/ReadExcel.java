package week5.day2.staticdata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	// public static String[][] getData(String excelFilePath) throws IOException {

	public static String[][] getData(String excelFilePath) throws IOException {

		// Open Excel
		XSSFWorkbook book = new XSSFWorkbook(excelFilePath);
		// Open Sheet
		XSSFSheet sheetAt = book.getSheetAt(0);
		// rowSize
		int rowNum = sheetAt.getLastRowNum();
		System.out.println(rowNum);
		// colSize
		int cellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println(cellNum);

		String[][] data = new String[rowNum][cellNum];

		for (int i = 1; i <= rowNum; i++) {
			XSSFRow eachrow = sheetAt.getRow(i);
			for (int j = 0; j < cellNum; j++) {
			XSSFCell eachcell = eachrow.getCell(j);
			String value = eachcell.getStringCellValue();
			data[i-1][j]=value;
			System.out.println(value);
				
			}

		}

		book.close();
		return data;

	}

}

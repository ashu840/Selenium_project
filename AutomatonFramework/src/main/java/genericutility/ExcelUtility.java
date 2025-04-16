package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getStringCellValue();
		
	}
	
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getBooleanCellValue();
		
		
	}
public double getNumberFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getNumericCellValue();
		
	}

public LocalDateTime getDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData");
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getLocalDateTimeCellValue();
	
}
	
	

}

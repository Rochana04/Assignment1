package utilityClasses;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
 private static Workbook workbook;
 private static Sheet sheet;

 public static void setExcelFile(String path, String sheetName) {
     try {
         FileInputStream fis = new FileInputStream(path);
         workbook = WorkbookFactory.create(fis);
         sheet = workbook.getSheet(sheetName);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

 public static String getCellData(int rowNum, int colNum) {
     Row row = sheet.getRow(rowNum);
     Cell cell = row.getCell(colNum);
     return cell.getStringCellValue();
 }

public static Sheet getSheet() {
	// TODO Auto-generated method stub
	return sheet;
}

}


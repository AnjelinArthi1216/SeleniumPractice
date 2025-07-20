package Utils;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {

	
	//if xlxs file format is used then XSSFWorkbook syntax should be used
	// if xls file format is used then HSSFWorkbook syntax should be used
	
	public static void getRowCount() {
		try {
		String publicDir = System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook(publicDir+"/excel/sample.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.createRow(3));
		System.out.println(sheet.getPhysicalNumberOfRows());
		}catch(Exception ignore) {
			System.out.println(ignore.getMessage());
			System.out.println(ignore.getCause());
			ignore.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
	}

}

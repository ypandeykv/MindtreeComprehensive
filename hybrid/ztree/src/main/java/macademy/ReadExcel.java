package macademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel {
	public WebDriver driver;
	public Object data0;
	public ReadExcel(WebDriver driver)
	{
		this.driver=driver;
	}

	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\exceldata\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		

	}

}

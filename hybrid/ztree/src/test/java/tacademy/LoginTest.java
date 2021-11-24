package tacademy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import macademy.ReadExcel;
import pageObject.LoginUp;
import pageObject.Signup;
import resources.Base;

public class LoginTest extends Base{
	
	
	//private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void Login() throws IOException, InterruptedException
	{
		File src=new File("C:\\Users\\ASHA PANDEY\\ztree\\ExcelFile\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(1).getCell(1).getStringCellValue();
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Signup sp=new Signup(driver);
		sp.SignIn().click();
		LoginUp lp=new LoginUp(driver);
		
		
		lp.Email().sendKeys(data0);
		lp.Password().sendKeys(data1);
		lp.SignIn().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\login.png"));
		driver.close();
		
		
		
		
		
		
	}
	

}


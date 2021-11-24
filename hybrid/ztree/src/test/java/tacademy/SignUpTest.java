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
import pageObject.Signup;
import resources.Base;

public class SignUpTest extends Base{
	//private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void signin() throws IOException, InterruptedException
	{
		File src=new File("C:\\Users\\ASHA PANDEY\\ztree\\ExcelFile\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String email=sheet1.getRow(1).getCell(0).getStringCellValue();
		String password=sheet1.getRow(1).getCell(1).getStringCellValue();
		String fname=sheet1.getRow(1).getCell(2).getStringCellValue();
		String lname=sheet1.getRow(1).getCell(3).getStringCellValue();
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Signup sp=new Signup(driver);
		sp.SignIn().click();
		sp.Create_Account().click();
		sp.FirstName().sendKeys(fname);
		sp.LastName().sendKeys(lname);
		sp.Email().sendKeys(email);
		sp.Password().sendKeys(password);
		sp.Create().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\signup.png"));
		driver.close();
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"emsb_booking_ticket\"]/div[2]/h4")).getText(),"Thank You");
		
		
		
	}
	
}

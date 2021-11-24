package tacademy;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.Base;

public class GetTitle extends Base{
	private  Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void title() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("url is loaded");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in",driver.getTitle());
		
		
		log.info("title is verified hurray");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\title.png"));
		driver.close();
		
		
		
		
		
		
		
	}
	
}



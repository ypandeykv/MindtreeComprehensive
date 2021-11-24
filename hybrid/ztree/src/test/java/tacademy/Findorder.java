package tacademy;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.AddToCart;
import pageObject.Navigation;
import resources.Base;

public class Findorder extends Base{
	private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void findorder() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("we have loaded the url");
		Navigation np3=new Navigation(driver);
		np3.TrackOrder().click();
		np3.Email().sendKeys("ypandeykv@gmail.com");
		np3.OrderId().sendKeys("134567");
		np3.FindOrder().click();
		log.info("we have traced the order");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\order.png"));
		
		driver.close();
		
		
		
		
		
		
		
	}
	

}




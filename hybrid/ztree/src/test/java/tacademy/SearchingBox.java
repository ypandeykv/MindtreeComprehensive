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
import pageObject.LoginUp;
import pageObject.Navigation;
import pageObject.Signup;
import resources.Base;

public class SearchingBox extends Base{
	private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void search() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Navigation np=new Navigation(driver);
		np.SearchBox().sendKeys("Bag");
		np.SearchBox().sendKeys(Keys.ENTER);
		log.info("Hurray we have searched the bag");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\bag.png"));
		driver.close();
		
		
		
		
		
		
		
		
	}
	

}



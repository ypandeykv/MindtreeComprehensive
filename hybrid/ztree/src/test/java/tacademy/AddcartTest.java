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

public class AddcartTest extends Base{
	//private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void cart() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Navigation np=new Navigation(driver);
		np.SearchBox().sendKeys("Bag");
		np.SearchBox().sendKeys(Keys.ENTER);
		AddToCart ap=new AddToCart(driver);
		ap.Bag().click();
		ap.AddToCart().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\addcart.png"));
		driver.close();
		
		
		
		
		
		
		
	}
	

}




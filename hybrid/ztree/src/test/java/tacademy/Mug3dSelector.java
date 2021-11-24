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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.AddToCart;
import pageObject.Navigation;
import resources.Base;

public class Mug3dSelector extends Base{
	//private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void mug3d() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Navigation np1=new Navigation(driver);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/a"))).build().perform();
		np1.Mug3d().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\mugsearch.png"));
		driver.close();
		
		 
		
		
		
		
		
		
		
	}
	
	

}







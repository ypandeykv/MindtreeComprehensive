package tacademy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import pageObject.Navigation;
import resources.Base;

public class Test10 extends Base{
	//private static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void lastTest() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		
		
		
		
		
	}
	
}




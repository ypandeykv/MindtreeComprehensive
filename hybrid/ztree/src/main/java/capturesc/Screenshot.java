package capturesc;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import resources.Base;

public class Screenshot extends Base
{
	public WebDriver driver;
	@Test
	public void capture() throws Exception
	{
		driver=initializeDriver();
		driver.get("http://www.facebook.com");
	
	TakesScreenshot ts=((TakesScreenshot)driver);
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ztree\\Screenshots\\yogesh.png"));
	
	}
}
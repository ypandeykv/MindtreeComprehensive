package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public Properties prop;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ASHA PANDEY\\ztree\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
				if(browserName.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\ztree\\Driver\\chromedriver.exe"); 
					driver=new ChromeDriver();
				}
				else
				{
					System.out.println("i donot have any another browser driver");
				}
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				return driver;
	}

}


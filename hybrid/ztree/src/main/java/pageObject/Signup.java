package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]");
	By create_account=By.xpath("//*[@id=\"customer_register_link\"]");
	By firstname=By.xpath("//*[@id=\"FirstName\"]");
	By lastname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"CreatePassword\"]");
	By create=By.xpath("//*[@id=\"create_customer\"]/p/input");
	
	public Signup(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	public WebElement Create_Account()
	{
		return driver.findElement(create_account);
	}
	public WebElement FirstName()
	{
		return driver.findElement(firstname);
	}
	public WebElement LastName()
	{
		return driver.findElement(lastname);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Create()
	{
		return driver.findElement(create);
	}
	
	
	
	
		
	

	

}


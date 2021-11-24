package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginUp {
	public WebDriver driver;
	By email=By.xpath("//*[@id=\"CustomerEmail\"]");
	By password=By.xpath("//*[@id=\"CustomerPassword\"]");
	By signin=By.xpath("//*[@id=\"customer_login\"]/p[1]/input");
	By logout=By.xpath("//*[@id=\"customer_logout_link\"]");
	
	
	public LoginUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	public WebElement Logout()
	{
		return driver.findElement(logout);
	}


}

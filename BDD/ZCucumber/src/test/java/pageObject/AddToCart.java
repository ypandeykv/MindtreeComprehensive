package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AddToCart {
	public WebDriver driver;
	By bag=By.xpath("//*[@id=\"snize-product-6783760498886\"]");
	
	By addtocart=By.xpath("//*[@id=\"AddToCartForm-6783760498886\"]/button");
	
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Bag()
	{
		return driver.findElement(bag);
	}
	public WebElement AddToCart1()
	{
		return driver.findElement(addtocart);
	}

}

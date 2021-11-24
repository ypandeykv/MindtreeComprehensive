package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Navigation {
	public WebDriver driver;
	
	By searchbox=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	
	//Now selecting 3D MUG from shop by category.
	
	By shopbycategory=By.xpath("//*[@id=\\\"myheader\\\"]/div[1]/div/div/ul/li[9]/a");
	
	By mug3d=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/ul/li[6]/a");
	
	By footertext=By.xpath("//*[@id=\"powered\"]/div[1]/ul/li");
	
	//now select gift card and add to cart the gift card and also enter pincode in pincode textbox 
	//and check expected delivery date
	
	By giftcard=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]");
	By pincode=By.xpath("//*[@id=\"PostalCode\"]");
	By check=By.xpath("//*[@id=\"cod-cheker\"]/button");
	By text=By.xpath("//*[@id=\"PostalCodeCheckerAvailability\"]");
	
	By addtocart=By.xpath("//*[@id=\"AddToCartForm-738195636312\"]/button");
	
	//track your order
	
	By trackorder=By.xpath("//*[@id=\"shopify-section-footer\"]/footer[1]/div[1]/div[1]/div[3]/ul/li[4]/a");
	By email=By.xpath("//*[@id=\"ola_email\"]");
	By orderid=By.xpath("//*[@id=\"ola_orderNumber\"]");
	By findorder=By.xpath("//*[@id=\"ola_submitButton\"]");
	
	
	
	
	
	
	
	public Navigation(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement SearchBox()
	{
		return driver.findElement(searchbox);
	}
	public WebElement ShopByCategory()
	{
		return driver.findElement(shopbycategory);
	}
	public WebElement Mug3d()
	{
		return driver.findElement(mug3d);
	}
	public WebElement FooterText()
	{
		return driver.findElement(footertext);
	}
	public WebElement GiftCard()
	{
		return driver.findElement(giftcard);
	}
	public WebElement PinCode()
	{
		return driver.findElement(pincode);
	}
	public WebElement Check()
	{
		return driver.findElement(check);
	}
	public WebElement AddToCart()
	{
		return driver.findElement(addtocart);
	}
	
	public WebElement TrackOrder()
	{
		return driver.findElement(trackorder);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement OrderId()
	{
		return driver.findElement(orderid);
	}
	public WebElement FindOrder()
	{
		return driver.findElement(findorder);
	}
	
	
 
 

}

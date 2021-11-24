package stepDefinations;

import resources.Base;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObject.AddToCart;
import pageObject.LoginUp;
import pageObject.Navigation;
import pageObject.Signup;

import org.openqa.selenium.interactions.Actions;



public class Steps extends Base{
	WebDriver driver;
    @Given("^User Launch Browser$")
    public void user_launch_browser() throws Throwable {
    	driver=initializeDriver();
    	 
        
    }

    @When("^Users Open Url \"([^\"]*)\"$")
    public void users_Open_Url(String arg1) throws Throwable {
        driver.get(arg1);
        Thread.sleep(3000);
        
    }

    @Then("^Page Title Should Be Verified$")
    public void page_title_should_be_verified() throws Throwable {
    	Assert.assertEquals("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in",driver.getTitle());
    	    }

    @And("^Close The Browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        
    }
    //footer verification
    @Then("^Page Footer Text Should Be Verified$")
    public void page_footer_text_should_be_verified() throws Throwable {
    	Navigation np1=new Navigation(driver);
    	Assert.assertTrue(np1.FooterText().isDisplayed());
    	TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\footer.png"));
    }
    //Login verification

    @Then("^User click On Signin Enter Email  Password  click on SignIN$")
    public void user_click_on_signin_enter_email_password_click_on_signin() throws Throwable 
    {
    	Signup sp=new Signup(driver);
		sp.SignIn().click();
    
        LoginUp lp=new LoginUp(driver);
		
		
		lp.Email().sendKeys("saurabh9027@gmail.com");
		lp.Password().sendKeys("123456789@");
		lp.SignIn().click();
		Thread.sleep(3000);
		
        
    }
    //SignUp verification
    @Then("^User click On Signin$")
    public void user_click_on_signin() throws Throwable {
    	Signup sp=new Signup(driver);
		sp.SignIn().click();
    }

    @Then("^User click on create account Enter Firstname Lastname Email,Password and  finally press Create Button$")
    public void user_click_on_create_account_enter_firstname_lastname_emailpassword_and_finally_press_create_button() throws Throwable {
    	File src=new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\ExcelFile\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String email=sheet1.getRow(1).getCell(0).getStringCellValue();
		String password=sheet1.getRow(1).getCell(1).getStringCellValue();
		String fname=sheet1.getRow(1).getCell(2).getStringCellValue();
		String lname=sheet1.getRow(1).getCell(3).getStringCellValue();
    	Signup sp=new Signup(driver);
    	sp.Create_Account().click();
		sp.FirstName().sendKeys(fname);
		sp.LastName().sendKeys(lname);
		sp.Email().sendKeys(email);
		sp.Password().sendKeys(password);
		sp.Create().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\signup.png"));
    }
    
    //Mug selection
    
    @Then("^User hover on Shop By Category selects 3D mug and Mug items Displayed$")
    public void user_hover_on_shop_by_category_selects_3d_mug_and_mug_items_displayed() throws Throwable {
    	Navigation np1=new Navigation(driver);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/a"))).build().perform();
     	np1.Mug3d().click();
     	Assert.assertTrue(np1.Mugtext().isDisplayed());
    }
    
    //Search box functonality
    
    @Then("^User Enter \"([^\"]*)\" on the searchbox and bag items are displayed$")
    public void user_enter_something_on_the_searchbox_and_bag_items_are_displayed(String strArg1) throws Throwable {
    	Navigation np=new Navigation(driver);
		np.SearchBox().sendKeys(strArg1);
		np.SearchBox().sendKeys(Keys.ENTER);
		Assert.assertEquals("Canvas Leather Laptop Bag",np.Bagtext().getText());
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\bag.png"));
    }
    @Then("^User click on track order and enter email id and tracking no and press Find order$")
    public void user_click_on_track_order_and_enter_email_id_and_tracking_no_and_press_find_order() throws Throwable {
       Navigation np3=new Navigation(driver);
	np3.TrackOrder().click();
	np3.Email().sendKeys("ypandeykv@gmail.com");
	np3.OrderId().sendKeys("134567");
	np3.FindOrder().click();
	TakesScreenshot ts=((TakesScreenshot)driver);
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\trackorder.png"));
    }
    
    //ADD TO CART
    
    @Then("^User search bag in search box and selects pokemon abg and add to cart it$")
    public void user_search_bag_in_search_box_and_selects_pokemon_abg_and_add_to_cart_it() throws Throwable {
    	Navigation np=new Navigation(driver);
		np.SearchBox().sendKeys("Bag");
		np.SearchBox().sendKeys(Keys.ENTER);
		AddToCart ap=new AddToCart(driver);
		ap.Bag().click();
		ap.AddToCart1().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\addtocart.png"));
    }
    
   
    @Then("^User click on gift card enter pin to check delivery is possible or not$")
    public void user_click_on_gift_card_enter_pin_to_check_delivery_is_possible_or_not() throws Throwable {
    	Navigation np2=new Navigation(driver);
    	np2.GiftCard().click();
		np2.PinCode().sendKeys("248007");
		np2.Check().click();
		np2.AddToCart().click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\ASHA PANDEY\\ZCucumber\\screenshots\\pinenter.png"));
        
    }
    @Then("^User Print Url and Source in the Console$")
    public void user_print_url_and_source_in_the_console() throws Throwable {
    	System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
    }
   

   
    }


   



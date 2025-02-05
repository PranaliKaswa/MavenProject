package source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']" )
	WebElement accandlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signIn;
	
	@FindBy(xpath="//span[.=\"Sign Out\"]")
	WebElement signout;
	
	public void acandlist(WebDriver driver)
	{
	    Actions a1 = new Actions(driver);
	    a1.moveToElement(accandlist).perform();		
	}
	
	public void SignIn(WebDriver driver)
	{
		signIn.click();
	}

	
	public void SignOut(WebDriver driver)
	{
	  signout.click();	
	}
	
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
}

package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class Search
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox'] ")
	WebElement search_tf;
	
	@FindBy(xpath="//input[@id=\"add-to-wishlist-button-submit\"]")
	WebElement wishlist_bt;
	
	public void search(WebDriver driver)
	{
		search_tf.sendKeys("Shoes" +Keys.ENTER);
	}
	public void WishList(WebDriver driver)
	{
		wishlist_bt.click();
	}
	
	public Search(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
}


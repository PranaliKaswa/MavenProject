package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement login_tf;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_bt;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin;
	
	public void username(WebDriver driver)
	{
		login_tf.sendKeys("9511728182");
	}
	
	public void continue_button(WebDriver driver)
	{
		continue_bt.click();
	}
	
	public void pass(WebDriver driver)
	{
		password.sendKeys("Pr@nali07");
	}
	
	public void SignIn(WebDriver driver)
	{
		signin.click();
	}
	
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	

}

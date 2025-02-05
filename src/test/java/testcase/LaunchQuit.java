package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	WebDriver driver;
	
	
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(100));
		w1.until(ExpectedConditions.titleContains("Amazon"));
	}
	
	@AfterMethod
	
	public void quit() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.quit();
	}

}

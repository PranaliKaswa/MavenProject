package testcase;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Search;

public class TestCase3 extends LaunchQuit {
	
	@Test
	public void login_to_Amazon() throws InterruptedException
	{
		
		HomePage h1 = new HomePage(driver);
		h1.acandlist(driver);
		h1.SignIn(driver);
		
		LoginPage l1 = new LoginPage(driver);
		Thread.sleep(25000);
		l1.username(driver);
		l1.continue_button(driver);
		l1.pass(driver);
		l1.SignIn(driver);
		
		Search s1 = new Search(driver);
		s1.search(driver);
		
		Set<String> s2 = driver.getWindowHandles();
		
		Iterator<String> i1 = s2.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
		
		s1.WishList(driver);
		
		h1.acandlist(driver);
		h1.SignOut(driver);
		
		
	}

}

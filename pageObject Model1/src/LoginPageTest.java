import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void verifyCRMLogin() {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//LoginPage Lpage = new LoginPage(driver);
		LoginPage2 Lpage = new LoginPage2(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		
		Lpage.setUserName("sonalik21");
		Lpage.setPassword("##Dhoni7");
		Lpage.clickOnLogin();
	}
	
}

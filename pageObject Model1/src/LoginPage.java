import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.name("username");
	By password = By.name("password");
	By loginbtn = By.xpath("//input[@type=\'submit\']");

	LoginPage(WebDriver d) {
		driver = d;
	}

	public void setUserName(String uname) {

		driver.findElement(username).sendKeys("sonalik21");

	}

	public void setPassword(String pwd) {

		driver.findElement(password).sendKeys("##Dhoni7");

	}
	
	public void clickOnLogin() {
		driver.findElement(loginbtn).click();
	}

}

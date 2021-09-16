import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement passWord;

	@FindBy(xpath = "//input[@type=\'submit\']")
	WebElement loginBtn;

	LoginPage2(WebDriver d) {
		// initiatie the driver
		driver = d;
		PageFactory.initElements(d, this);
	}

	public void setUserName(String uname) {

		userName.sendKeys("sonalik21");

	}

	public void setPassword(String pwd) {

		passWord.sendKeys("##Dhoni7");

	}

	public void clickOnLogin() {
		loginBtn.click();
	}

}

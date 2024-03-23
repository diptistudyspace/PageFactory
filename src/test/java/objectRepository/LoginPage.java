package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);//here this is LoginPage
	}

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement password;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement loginButton;
	
	public WebElement userName() {
		return userName;
	}

	public WebElement password() {
		return password;
	}

	public WebElement loginButton() {
		return loginButton;
	}
}

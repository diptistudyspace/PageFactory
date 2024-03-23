package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfolioPage {
	WebDriver driver;

	public PortfolioPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);//here this is class PortfolioPage
	}

	@FindBy(className="oxd-userdropdown-tab")
	private WebElement setting;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	private WebElement DashBoard;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	private WebElement logout;

	public WebElement setting() {
		return setting;
	}

	public WebElement DashBoard() {
		return DashBoard;
	}

	public WebElement logout() {
		return logout;
	}
}

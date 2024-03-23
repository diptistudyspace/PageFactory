package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.PortfolioPage;


public class TestBase {
	WebDriver driver;
	@Test
	public void testLoginPage() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.userName().sendKeys("Admin");
		loginpage.password().sendKeys("admin123");
		loginpage.loginButton().click();
		
		PortfolioPage pfpage=new PortfolioPage(driver);
		pfpage.setting().click();
		
		Assert.assertTrue(pfpage.DashBoard().isDisplayed(),"Dashboard element is displayed.");
		
		pfpage.logout().click();
		
		
	}
	@AfterTest
	public void closure() {
		driver.quit();
	}
}

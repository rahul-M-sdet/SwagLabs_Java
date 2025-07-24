package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_001 {
	
public WebDriver driver;
@BeforeMethod
public void setUp() {
driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.manage().window().maximize();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
@Test
public void verifyLoginPage() {
LoginPage lp = new LoginPage(driver);
lp.enterUser("standard_user");
lp.enterPassword("secret_sauce");
lp.clickLogin();

}
}
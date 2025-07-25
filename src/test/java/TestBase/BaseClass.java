package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
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

}

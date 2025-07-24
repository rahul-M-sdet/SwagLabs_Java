package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(id="user-name")
WebElement txtUsername;
	
@FindBy(id="password")
WebElement txtPassword;	

@FindBy(id="login-button")
WebElement btnLogin;
	
public void enterUser(String username){
	txtUsername.sendKeys(username);
}
public void enterPassword(String pwd){
	txtPassword.sendKeys(pwd);
}
public void clickLogin(){
	btnLogin.click();
}

}

package TestCase;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import TestBase.BaseClass;

public class TC_001 extends BaseClass {
	


@Test
public void verifyLoginPage() {
LoginPage lp = new LoginPage(driver);
lp.enterUser("standard_user");
lp.enterPassword("secret_sauce");
lp.clickLogin();

}
}
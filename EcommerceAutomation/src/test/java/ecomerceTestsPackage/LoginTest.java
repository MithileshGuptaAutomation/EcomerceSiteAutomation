package ecomerceTestsPackage;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import ecomerceBasePackage.BaseTest;
import ecommercePagesPackage.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.LoginCredentials("problem_user", "secret_sauce");	
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		Assert.assertTrue(Url.contains("inventory"), "Login Failed");
		System.out.println("Login was Successfull");
		
	}

	

}

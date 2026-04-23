package ecommercePagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	
	 //Constructor 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	By username= By.id("user-name");
	By password= By.id("password");
	By loginbtn= By.id("login-button");
	 
	public void LoginCredentials(String user, String pass ) throws InterruptedException {
		driver.findElement(username).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(loginbtn).click();
		Thread.sleep(1000);

	}

}

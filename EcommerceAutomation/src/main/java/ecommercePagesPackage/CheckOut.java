package ecommercePagesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOut {

	WebDriver driver;
	WebDriverWait wait;

	public CheckOut(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	By checkOutBtn = By.id("checkout");

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueBtn = By.id("continue");

	By finishBtn = By.id("finish");

	public void clickOnCheckOut() {

		WebElement checkout = wait.until(
				ExpectedConditions.elementToBeClickable(checkOutBtn)
				);
		checkout.click();

		//Wait for next page to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
	}

	public void letsCheckOut() {

	    WebElement fname = wait.until(
	        ExpectedConditions.elementToBeClickable(firstName)
	    );
	    fname.clear();
	    fname.sendKeys("Mithilesh");

	    WebElement lname = wait.until(
	        ExpectedConditions.elementToBeClickable(lastName)
	    );
	    lname.clear();
	    lname.sendKeys("Gupta");

	    WebElement pcode = wait.until(
	        ExpectedConditions.elementToBeClickable(postalCode)
	    );
	    pcode.clear();
	    pcode.sendKeys("400056");

	    WebElement continueButton = wait.until(
	        ExpectedConditions.elementToBeClickable(continueBtn)
	    );
	    continueButton.click();
	}

	public void confirmOrder() {

		WebElement finish = wait.until(
				ExpectedConditions.elementToBeClickable(finishBtn)
				);
		finish.click();
	}
}
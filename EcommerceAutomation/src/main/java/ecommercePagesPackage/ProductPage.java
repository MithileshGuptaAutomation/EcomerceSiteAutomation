package ecommercePagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	By cartButton= By.id("add-to-cart-sauce-labs-backpack");
	
	By cartlink= By.xpath("//*[@id=\"shopping_cart_container\"]/a");


	public void  addTocart() {
			driver.findElement(cartButton).click();
	}
	
	public void clickOnCart() {
		driver.findElement(cartlink).click();
	}

}

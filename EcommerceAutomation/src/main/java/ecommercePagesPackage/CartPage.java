package ecommercePagesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait; //Declare at class level

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ Correct type
    }
    
    By cartItem=By.className("inventory_item_name");

    public String getCartItems() {
        return driver.findElement(cartItem).getText();
    }
}
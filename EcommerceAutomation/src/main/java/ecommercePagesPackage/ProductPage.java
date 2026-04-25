package ecommercePagesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ FIX
    }

    By cartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartlink = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");

    public void addTocart() {
        //Wait until product button is clickable
        WebElement product = wait.until(
            ExpectedConditions.elementToBeClickable(cartButton)
        );
        product.click();
    }

    public void clickOnCart() {
        WebElement cart = wait.until(
            ExpectedConditions.elementToBeClickable(cartlink)
        );
        ((org.openqa.selenium.JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", cart);
    }
}
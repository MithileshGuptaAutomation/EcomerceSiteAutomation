package ecomerceTestsPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecomerceBasePackage.BaseTest;
import ecommercePagesPackage.CartPage;
import ecommercePagesPackage.LoginPage;
import ecommercePagesPackage.ProductPage;

public class AddToCartTest extends BaseTest{
	@Test
	public void ProductInCart() throws InterruptedException{
	 LoginPage login=new LoginPage(driver);
	 login.LoginCredentials("problem_user", "secret_sauce");
	 Thread.sleep(2000);
	 
	 ProductPage product=new ProductPage(driver);
	 product.addTocart();
	 Thread.sleep(2000);

	 product.clickOnCart();
	 Thread.sleep(2000);

	 System.out.println(driver.getCurrentUrl());

	 CartPage cartPage=new CartPage(driver);
	String ProductName= cartPage.getCartItems();
	System.out.println(ProductName);
	System.out.println(driver.getCurrentUrl());
	 
	Assert.assertTrue(ProductName.toLowerCase().contains("backpack"));
	 System.out.println(ProductName+" was successfully added to cart");
	}
}

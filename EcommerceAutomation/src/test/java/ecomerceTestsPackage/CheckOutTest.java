package ecomerceTestsPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecomerceBasePackage.BaseTest;
import ecommercePagesPackage.CartPage;
import ecommercePagesPackage.CheckOut;
import ecommercePagesPackage.LoginPage;
import ecommercePagesPackage.ProductPage;

public class CheckOutTest extends BaseTest {

	@Test
	public void CheckOutFlow() throws InterruptedException {

		LoginPage login=new LoginPage(driver);
		login.LoginCredentials("standard_user", "secret_sauce");
		System.out.println("User has Logged in Successfully");
		System.out.println("Currently user is at:"+driver.getCurrentUrl());
		Thread.sleep(2000);

		ProductPage product=new ProductPage(driver);
		product.addTocart();
		System.out.println("Product is added to Cart");
		Thread.sleep(2000);

		product.clickOnCart();
		System.out.println("Currently user is at:"+driver.getCurrentUrl());
		Thread.sleep(2000);


		CartPage cartPage=new CartPage(driver);
		String ProductName= cartPage.getCartItems();
		System.out.println("Product added in cart is:"+ProductName);
		Thread.sleep(2000);


		CheckOut checkout = new CheckOut(driver);
		checkout.clickOnCheckOut();
		System.out.println("The user has moved to:"+driver.getCurrentUrl());
		Thread.sleep(2000);


		checkout.letsCheckOut();
		System.out.println("Now User has moved to:"+driver.getCurrentUrl());
		Thread.sleep(2000);

		
		checkout.confirmOrder();
		String Url=driver.getCurrentUrl();
		System.out.println("Final URL:"+Url);

		Assert.assertTrue(Url.contains("checkout-complete"));
		System.out.println("Test was successfull order is placed");
	} 
}

package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PurchaseTest extends BaseTest{

    @Test
    public void purchaseProductSuccessfully() {

        LoginPage loginPage = new LoginPage();
        ProductsPage productsPage = new ProductsPage();
        CartPage cartPage = new CartPage();
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();
        CheckoutCompletePage completePage = new CheckoutCompletePage();

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();
        productsPage.openCart();

        Assert.assertTrue(cartPage.isBackpackItemDisplayed(), "Backpack is not in the cart!");

        cartPage.clickCheckout();

        checkoutStepOnePage.fillCheckoutForm("Alice", "Ice", "345");
        checkoutStepOnePage.clickContinue();

        Assert.assertTrue(cartPage.isBackpackItemDisplayed(), "Backpack is not in the cart!");
        checkoutStepTwoPage.finishOrder();

        Assert.assertTrue(completePage.isOrderCompletedWithSuccess(),"Order completion failed!");
    }
}

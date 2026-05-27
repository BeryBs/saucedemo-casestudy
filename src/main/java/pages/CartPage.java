package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {
    private static final By checkoutButton = By.id("checkout");
    private static final By continueShoppingButton = By.id("continue-shopping");

    public void clickCheckout() {
        click(checkoutButton);
    }
}

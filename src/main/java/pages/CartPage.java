package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {
    private static final By checkoutButton = By.id("checkout");
    private static final By continueShoppingButton = By.id("continue-shopping");
    private static final By backpackItem= By.xpath("//div[text()='Sauce Labs Backpack']");

    public void clickCheckout() {
        click(checkoutButton);
    }

    public boolean isBackpackItemDisplayed() {
        return find(backpackItem).isDisplayed();
    }
}

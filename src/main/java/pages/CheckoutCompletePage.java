package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage {
    private static final By backHomeButton= By.id("back-to-products");
    private static final By completeHeader = By.xpath("//h2[@data-test='complete-header']");


    public boolean isOrderCompletedWithSuccess() {
        return find(completeHeader).isDisplayed();
    }

}

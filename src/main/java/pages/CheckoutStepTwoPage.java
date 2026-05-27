package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CheckoutStepTwoPage extends BasePage {
    private static final By finishButton = By.id("finish");
    private static final By cancelButton= By.id ("cancel");

    public void finishOrder() {
        click(finishButton);
    }

}

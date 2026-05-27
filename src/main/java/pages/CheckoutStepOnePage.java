package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CheckoutStepOnePage extends BasePage {
    private static final By firstNameInputField = By.id("first-name");
    private static final By lastNameInputField = By.id("last-name");
    private static final By postalCodeInputField = By.id("postal-code");
    private static final By continueButton = By.id("continue");

    public void fillCheckoutForm(String firstName, String lastName, String zipCode) {
        set(firstNameInputField, firstName);
        set(lastNameInputField, lastName);
        set(postalCodeInputField, zipCode);
    }

    public void clickContinue() {
        click(continueButton);
    }

}

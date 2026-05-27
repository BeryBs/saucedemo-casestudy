package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    public static WebDriver driver;
    protected static WebDriverWait wait;

    public BasePage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setDriver(WebDriver driver) {

        BasePage.driver = driver;
    }

    protected static WebElement find(By locator) {

        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElement(locator).click();

        } catch (ElementClickInterceptedException e) {

            WebElement element = find(locator);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", element
            );
        }
    }

}
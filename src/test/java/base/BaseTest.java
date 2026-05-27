package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;

    @BeforeClass
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        String url = "https://www.saucedemo.com/";
        driver.get(url);

        basePage = new BasePage();
        basePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
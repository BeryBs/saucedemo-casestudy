package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
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

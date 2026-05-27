package pages;
import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By userName = By.id("user-name");
    private static final By userPassword= By.id("password");
    private static final By loginButton= By.id("login-button");

    public void login(String user, String pass) {
        set(userName, user);
        set(userPassword, pass);
        click(loginButton);
    }
}

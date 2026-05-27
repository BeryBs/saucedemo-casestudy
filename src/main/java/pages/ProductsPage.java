package pages;
import base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private static final By addBackpackToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private static final By shoppingCartIcon= By.id("shopping_cart_container");

    public void addBackpackToCart() {
        click(addBackpackToCartButton);
    }

    public void openCart() {
        click(shoppingCartIcon);
    }
}

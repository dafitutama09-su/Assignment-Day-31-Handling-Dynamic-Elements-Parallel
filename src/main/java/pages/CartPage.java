package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Nama item yang muncul di cart (contoh: Sauce Labs Backpack)
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    private WebElement cartItemName;

    // Tombol Checkout
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;

    // Verifikasi barang ada di cart
    public void verifyCartItemIsDisplayed() {
        Assert.assertTrue(cartItemName.isDisplayed(),
                "Item in cart is not displayed");
    }

    // Verifikasi tombol checkout tampil
    public void verifyCheckoutButtonIsDisplayed() {
        Assert.assertTrue(checkoutButton.isDisplayed(),
                "Checkout button is not displayed");
    }

    // Klik tombol Checkout
    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
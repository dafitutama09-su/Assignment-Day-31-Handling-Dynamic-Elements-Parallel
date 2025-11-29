package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Logo Swag Labs (indikator login sukses)
    @FindBy(xpath = "//*[@class='app_logo']")
    private WebElement swagLabLogo;

    // Tombol Add to Cart untuk Sauce Labs Backpack
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartBackpackButton;

    // Icon cart di kanan atas
    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    private WebElement cartIcon;

    // Verifikasi halaman tampil
    public void verifySwagLabLogoIsDisplayed(){
        Assert.assertTrue(swagLabLogo.isDisplayed(), "Swag Lab logo is not displayed");
    }

    public void verifyAddToCartBackpackButtonIsDisplayed(){
        Assert.assertTrue(addToCartBackpackButton.isDisplayed(),
                "Add to Cart Backpack button is not displayed");
    }

    public void clickAddToCartBackpackButton(){
        addToCartBackpackButton.click();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }
}
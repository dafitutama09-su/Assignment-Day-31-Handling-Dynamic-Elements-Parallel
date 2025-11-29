package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CompletePage extends BasePage {
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    // Text "Thank You for Your Order!"
    @FindBy(xpath = "//*[@class='complete-header']")
    private WebElement completeHeader;

    // Text deskripsi sukses order
    @FindBy(xpath = "//*[@class='complete-text']")
    private WebElement completeText;

    // Tombol Back Home
    @FindBy(xpath = "//*[@id='back-to-products']")
    private WebElement backHomeButton;

    // Verifikasi header muncul
    public void verifyCompleteHeaderIsDisplayed() {
        Assert.assertTrue(completeHeader.isDisplayed(),
                "'Thank You' header is not displayed");
    }

    // Verifikasi text sukses muncul
    public void verifyCompleteTextIsDisplayed() {
        Assert.assertTrue(completeText.isDisplayed(),
                "Complete text is not displayed");
    }

    // Verifikasi tombol Back Home muncul
    public void verifyBackHomeButtonIsDisplayed() {
        Assert.assertTrue(backHomeButton.isDisplayed(),
                "Back Home button is not displayed");
    }

    // Klik tombol Back Home (optional)
    public void clickBackHomeButton() {
        backHomeButton.click();
    }
}
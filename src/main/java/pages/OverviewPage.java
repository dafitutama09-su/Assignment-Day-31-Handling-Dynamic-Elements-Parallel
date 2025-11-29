package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    // Item name di overview (contoh: Sauce Labs Backpack)
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    private WebElement overviewItemName;

    // Total harga (Optional, bisa dipakai untuk verifikasi)
    @FindBy(xpath = "//*[@class='summary_total_label']")
    private WebElement totalPriceLabel;

    // Tombol Finish
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement finishButton;

    // Verifikasi item tampil
    public void verifyOverviewItemIsDisplayed() {
        Assert.assertTrue(overviewItemName.isDisplayed(),
                "Item on overview page is not displayed");
    }

    // Verifikasi total harga tampil
    public void verifyTotalPriceIsDisplayed() {
        Assert.assertTrue(totalPriceLabel.isDisplayed(),
                "Total price label is not displayed");
    }

    // Verifikasi tombol finish tampil
    public void verifyFinishButtonIsDisplayed() {
        Assert.assertTrue(finishButton.isDisplayed(),
                "Finish button is not displayed");
    }

    // Klik tombol finish
    public void clickFinishButton() {
        finishButton.click();
    }
}
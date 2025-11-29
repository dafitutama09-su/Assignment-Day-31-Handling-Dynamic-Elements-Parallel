package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutInformationPage extends BasePage {
    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    // Field firstname
    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement firstNameTextField;

    // Field lastname
    @FindBy(xpath = "//*[@id='last-name']")
    private WebElement lastNameTextField;

    // Field postal code
    @FindBy(xpath = "//*[@id='postal-code']")
    private WebElement postalCodeTextField;

    // Tombol Continue
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    // Verifikasi field tampil
    public void verifyFirstNameTextFieldIsDisplayed() {
        Assert.assertTrue(firstNameTextField.isDisplayed(),
                "First Name TextField is not displayed");
    }

    public void verifyLastNameTextFieldIsDisplayed() {
        Assert.assertTrue(lastNameTextField.isDisplayed(),
                "Last Name TextField is not displayed");
    }

    public void verifyPostalCodeTextFieldIsDisplayed() {
        Assert.assertTrue(postalCodeTextField.isDisplayed(),
                "Postal Code TextField is not displayed");
    }

    public void verifyContinueButtonIsDisplayed() {
        Assert.assertTrue(continueButton.isDisplayed(),
                "Continue button is not displayed");
    }

    // Input data
    public void inputFirstName(String fname) {
        firstNameTextField.sendKeys(fname);
    }

    public void inputLastName(String lname) {
        lastNameTextField.sendKeys(lname);
    }

    public void inputPostalCode(String postal) {
        postalCodeTextField.sendKeys(postal);
    }

    // Klik continue
    public void clickContinueButton() {
        continueButton.click();
    }
}

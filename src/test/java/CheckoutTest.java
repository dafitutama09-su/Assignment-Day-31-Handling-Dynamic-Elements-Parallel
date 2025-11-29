import core.BaseTest;
import core.DriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(CheckoutTest.class);

    @Test
    public void test_002_successCheckout() {

        log.info("Test Started");

        // Page Objects
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        CartPage cartPage = new CartPage(DriverManager.getDriver());
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(DriverManager.getDriver());
        OverviewPage overviewPage = new OverviewPage(DriverManager.getDriver());
        CompletePage completePage = new CompletePage(DriverManager.getDriver());

        // 1. Login
        loginPage.inputUsernameTextField("standard_user");
        loginPage.inputPasswordTextField("secret_sauce");
        loginPage.clickLoginButton();

        // 2. Verifikasi masuk ke Product Page
        productPage.verifySwagLabLogoIsDisplayed();
        productPage.verifyAddToCartBackpackButtonIsDisplayed();

        // 3. Tambahkan barang ke keranjang
        productPage.clickAddToCartBackpackButton();
        productPage.clickCartIcon();

        // 4. Verifikasi Cart Page
        cartPage.verifyCartItemIsDisplayed();
        cartPage.verifyCheckoutButtonIsDisplayed();
        cartPage.clickCheckoutButton();

        // 5. Input data checkout info
        checkoutInformationPage.verifyFirstNameTextFieldIsDisplayed();
        checkoutInformationPage.verifyLastNameTextFieldIsDisplayed();
        checkoutInformationPage.verifyPostalCodeTextFieldIsDisplayed();
        checkoutInformationPage.verifyContinueButtonIsDisplayed();

        checkoutInformationPage.inputFirstName("Dafit");
        checkoutInformationPage.inputLastName("QA");
        checkoutInformationPage.inputPostalCode("12345");
        checkoutInformationPage.clickContinueButton();

        // 6. Overview Page
        overviewPage.verifyOverviewItemIsDisplayed();
        overviewPage.verifyTotalPriceIsDisplayed();
        overviewPage.verifyFinishButtonIsDisplayed();
        overviewPage.clickFinishButton();

        // 7. Complete Page
        completePage.verifyCompleteHeaderIsDisplayed();
        completePage.verifyCompleteTextIsDisplayed();
        completePage.verifyBackHomeButtonIsDisplayed();

        log.info("Test Finish");
    }
}
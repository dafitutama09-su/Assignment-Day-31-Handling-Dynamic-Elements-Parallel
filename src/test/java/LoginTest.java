import core.BaseTest;
import core.DriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void test_001_suksesLogin(){
        log.info("Test Started");
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());

        //input username
        loginPage.inputUsernameTextField("standard_user");

        //input password
        loginPage.inputPasswordTextField("secret_sauce");

        //klik tombol login
        loginPage.clickLoginButton();

        //Verifikasi bahwa login berhasil
        productPage.verifySwagLabLogoIsDisplayed();
        log.info("Test Finish");
    }
}

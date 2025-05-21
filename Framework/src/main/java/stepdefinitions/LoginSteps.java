package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver= null;
    LoginPage lp = null;
    HomePage hp = null;

    @Given ("User is on login page")
    public void user_is_on_login_page() {
        driver = BaseTest.getBrowserDriver("chrome", false);
        driver. get ("https://login.salesforce.com");
        lp = new LoginPage(driver);
    }

    @When ("User enters valid username")
    public void user_enters_valid_username() {
        lp.enterUsername("anmol1@tekarch.com");
    }

   @When("User enters valid password")
    public void user_enters_valid_password() {
        lp.enterPassword("Zaildaranmol@4");
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        lp.clickLogin();
    }

    @Then ("User should land on homepage")
    public void user_should_land_on_home_page() {
        hp = new HomePage(driver);
        assertTrue(hp.verifyHomePage(),"");
    }
}

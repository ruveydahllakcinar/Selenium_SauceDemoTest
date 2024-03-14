package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("User at login page")
    public void userAtLoginPage() {
        loginPage.userAtLoginPage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("Write {string} for username field")
    public void writeForUsernameField(String Username) {
        loginPage.writeUsernameForUsernameField(Username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String username) {
        loginPage.checkMessage(username);
    }

    @When("Write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }
}

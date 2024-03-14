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

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctUsername) {
        loginPage.writeCorrectForUsernameField(correctUsername);
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String falsePass) {
        loginPage.writeFalseForPasswordField(falsePass);
    }

    @Then("Check {string} message about dont match password")
    public void checkMessageAboutDontMatchPassword(String dontMatch) {
        loginPage.checkMessageAboutDontMatch(dontMatch);
    }

    @When("write False {string} for username field")
    public void writeFalseForUsernameField(String falseUsername) {
        loginPage.writeFalseForUsernameField(falseUsername);
    }

    @When("write correct {string} for password field")
    public void writeCorrectForPasswordField(String correctPassword) {
        loginPage.writeCorrectForPasswordField(correctPassword);
    }

    @Then("Check {string} message about dont match username")
    public void checkMessageAboutDontMatchUsername(String error) {
        loginPage.checkMessageAboutDontMatchUsername(error);
    }


    @Then("Login is successful")
    public void loginIsSuccessful() {
        loginPage.loginIsSuccessful();
    }
}

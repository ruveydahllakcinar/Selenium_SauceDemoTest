package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    By loginButton= By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error'");
    By usernamebox = By.cssSelector("#user-name");
    By passwordBox = By.cssSelector("#password");


    public void userAtLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String username) {

        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"Ruveyda");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox, "123456");

    }

    public void writeCorrectForUsernameField(String correctUsername) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox, "problem_user");
    }

    public void writeFalseForPasswordField(String falsePass) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"123456");
    }

    public void checkMessageAboutDontMatch(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeFalseForUsernameField(String falseUsername) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"Ruveyda");
    }

    public void writeCorrectForPasswordField(String correctPassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"secret_sauce");
    }

    public void checkMessageAboutDontMatchUsername(String error) {
        elementHelper.checkVisible(errorMessage);
    }

    public void loginIsSuccessful() {
        elementHelper.click(loginButton);
    }
}

package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @FindBy(css = ".breadcrumb > li")
    private WebElement welcomeMessage;

    @FindBy(css = ".user-area img")
    private WebElement avatar;

    @FindBy(css = ".user-menu a[href=\"/bank/logout\"]")
    private WebElement logoutButton;

    @FindBy(id = "checking-menu")
    private WebElement menuChecking;

    @FindBy(id = "new-checking-menu-item")
    private WebElement newCheckingButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Get page title")
    public String getPageTitle() {
        return pageTitle.getText();
    }

    @Step("Get welcome message")
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    @Step("Get current url")
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Step("Logout")
    public LoginPage logout() {
        avatar.click();
        logoutButton.click();
        return new LoginPage(driver);
    }

    public CheckingPage goToNewChecking() {
        menuChecking.click();
        newCheckingButton.click();
        return new CheckingPage(driver);
    }
}

package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewSavingsAccount extends BasePage{
    public ViewSavingsAccount(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "new-account-msg")
    private WebElement newAccountMessage;

    @Step("Check the page title assert")
    public String getNewAccountMessage() {
        return newAccountMessage.getText();
    }
}

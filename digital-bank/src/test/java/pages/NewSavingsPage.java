package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage {

    public NewSavingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "savings-menu")
    private WebElement savingsMenu;

    @FindBy(id = "new-savings-menu-item")
    private WebElement newSavings;

    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @FindBy(id = "Savings")
    private WebElement savingsAccountType;

    @FindBy(id = "Individual")
    private WebElement individualAccount;

    @FindBy(id = "name")
    private WebElement accountName;

    @FindBy(id = "openingBalance")
    private WebElement initialDeposit;

    @FindBy(id = "newSavingsSubmit")
    private WebElement savingsSubmitButton;

    @Step("Click on Savings Menu")
    public void clickSavingsMenu() {
        savingsMenu.click();
    }

    @Step("Click on New Savings ")
    public void newSavings() {
        newSavings.click();
    }

    @Step("Confirm the title coincidence")
    public String pageTitle() {
        return pageTitle.getText();
    }

    @Step("Click in Savings Account Type")
    public void clickStandardSavings() {
        savingsAccountType.click();
    }

    @Step("Click in Individual Account")
    public void clickIndividualAccount() {
        individualAccount.click();
    }

    @Step("Enter Account Name")
    public void accountName(String accountName) {
        this.accountName.sendKeys(accountName);
    }

    @Step("Enter Initial Deposit")
    public void initialDeposit(String initialDeposit) {
        this.initialDeposit.sendKeys(initialDeposit);
    }

    @Step("Click on Submit button")
    public ViewSavingsPage clickSubmitButton() {
        savingsSubmitButton.click();
        return new ViewSavingsPage(driver);
    }
}

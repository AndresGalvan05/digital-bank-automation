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
    private WebElement newSavingsMenu;

    @FindBy(xpath = "//strong[contains(text(),'New Savings Account')]")
    private WebElement newSavingsAccount;

    @FindBy(id = "Individual")
    private WebElement individualRadioBtn;

    @FindBy(id = "name")
    private WebElement nameInput;
    @FindBy(id = "openingBalance")
    private WebElement openingBalanceInput;

    @FindBy(id = "newSavingsSubmit")
    private WebElement newSavingsSubmitButton;

    @Step("Click on savings button")
    public void saving() {
        savingsMenu.click();
    }
    @Step("Click on savings menu")
    public void savingMenu() {
        newSavingsMenu.click();
    }
    @Step("Check the page title assert")
    public String getPageTitle() {
        return newSavingsAccount.getText();
    }
    @Step("Click on individual radio button ")
    public void individualRadioBtn() {
        individualRadioBtn.click();
    }
    @Step("Enter name in input field")
    public void enterTextInNameInput(String text) {
        nameInput.clear();
        nameInput.sendKeys(text);
    }
    @Step("Enter opening value in input field")
    public void enterTextInOpeningBalanceInput(String text) {
        openingBalanceInput.clear();
        openingBalanceInput.sendKeys(text);
    }
    @Step("Press Enter to submit data")
    public void clickNewSavingsSubmitButton() {
        newSavingsSubmitButton.click();
    }

}

package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingPage extends BasePage {

    @FindBy(xpath = "//div[@id='right-panel']/div[2]/div/div/div/div/form/div/div[2]/div[2]/label")
    private WebElement standardCheckingButton;

    @FindBy(xpath= "//div[@id='right-panel']/div[2]/div/div/div/div/form/div/div[3]/div[2]/label")
    private WebElement individualButton;

    @FindBy(id = "name")
    private WebElement accountName;

    @FindBy(id = "openingBalance")
    private WebElement initialDeposit;

    @FindBy(id = "newCheckingReset")
    private WebElement resetButton;


    public CheckingPage(WebDriver driver) {
        super(driver);
    }

    public void completeFormNewChecking() {
        standardCheckingButton.click();
        individualButton.click();
        accountName.click();
        accountName.clear();
        accountName.sendKeys("Prueba1");
        initialDeposit.click();
        initialDeposit.clear();
        initialDeposit.sendKeys("40000");
    }

    public void resetForm() {
        resetButton.click();
    }

}


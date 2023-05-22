package scripts;

import dataProviders.SavingsData;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.NewSavingsPage;
import pages.ViewSavingsAccount;
import utils.Constants;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class newSavingsCreateAccountTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Constants.urlBase);
    }

    @Test(dataProvider = "account", dataProviderClass = SavingsData.class)

    public void testSearchSavings(String name, String value) {
        String expectedUrl = "http://digitalbank.upcamp.io/bank/home";
        String expectedTitle = "New Savings Account";
        String expectedSuccessfullyMessage = "Successfully created new Money Market account named ahorros";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameAndPassword(Constants.userAndy, Constants.passwordAndy);

        HomePage homePage = loginPage.clickLoginButton();
        assertEquals(homePage.getCurrentUrl(), expectedUrl);
        assertEquals(homePage.getPageTitle(), expectedTitle);


        NewSavingsPage newSavingsPage = new NewSavingsPage(driver);
        newSavingsPage.saving();
        newSavingsPage.savingMenu();
        assertEquals(newSavingsPage.getPageTitle(), expectedTitle);
        newSavingsPage.moneyMarketRadioBtn();
        newSavingsPage.jointRadioBtn();
        newSavingsPage.enterNameValueInput(name, value);

        ViewSavingsAccount viewSavingsAccount = newSavingsPage.clickNewSavingsSubmitButton();
        assertEquals(viewSavingsAccount.getNewAccountMessage(), expectedSuccessfullyMessage);
        takeScreenshot();
        homePage.logout();
   }

    @AfterTest
    public void tearDown() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Exception while closing the driver " + e.getMessage());
        }
    }

    @Attachment(type = "image/png")
    @AfterMethod(alwaysRun = true)
    public byte[] takeScreenshot() {
        byte[] image = new byte[0];
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            image = screenshot.getScreenshotAs(OutputType.BYTES);
            System.out.println("Successfully captured a screenshot");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
        return image;
    }
}

package dataProviders;

import org.testng.annotations.DataProvider;

public class AccountData {
    @DataProvider(name = "account")
    public static Object[][] getAccountData() {
        return new Object[][]{
                {"New Savings Account","probate","100",}
        };
    }
}

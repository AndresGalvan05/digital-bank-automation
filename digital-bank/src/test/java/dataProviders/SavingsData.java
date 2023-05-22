package dataProviders;

import org.testng.annotations.DataProvider;

public class SavingsData {
    @DataProvider(name = "account")
    public static Object[][] getAccountData() {
        return new Object[][]{
                {"New Savings Account","ahorros","5000","Successfully created new Money Market account named ahorros"}
        };
    }
}

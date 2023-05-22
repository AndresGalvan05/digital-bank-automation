package dataProviders;

import org.testng.annotations.DataProvider;

public class ViewCheckingAccountsData {
    @DataProvider(name = "viewCheckingAccounts")
    public static Object[][] getCheckingAccounts() {
        return new Object[][]{
                {"2", "2023-05-22 17:22", "Income", "845334864 (DPT) - Deposit", "$7500.00", "$7500.00"},
                {"3", "2023-05-22 17:20", "Income", "845334859 (DPT) - Deposit", "$100.00", "$100.00"},
        };
    }
}

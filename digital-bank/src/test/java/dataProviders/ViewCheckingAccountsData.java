package dataProviders;

import org.testng.annotations.DataProvider;

public class ViewCheckingAccountsData {
    @DataProvider(name = "viewCheckingAccounts")
    public static Object[][] getCheckingAccounts() {
        return new Object[][]{
                {"2", "2023-05-03 03:54", "Bills & Utilities", "845334067 (CHK) - Lockman and Sons Mortgage", "$-1514.24", "$469.04"},
                {"3", "2023-05-07 05:49", "Bills & Utilities", "845333931 (CHK) - Emmerich-Watsica Mortgage", "$-1606.98", "$396.04"},
        };
    }
}

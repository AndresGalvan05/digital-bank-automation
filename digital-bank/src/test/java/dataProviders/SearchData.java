package dataProviders;

import org.testng.annotations.DataProvider;

public class SearchData {
    @DataProvider(name = "search")
    public static Object[][] getSearchData() {
        return new Object[][]{
                {"Andy", "View Savings Accounts","CNP Dividend","845334106 (DPT) - CNP Dividend",
                }
        };
    }
}

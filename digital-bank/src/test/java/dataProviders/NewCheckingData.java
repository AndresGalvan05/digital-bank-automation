package dataProviders;

import org.testng.annotations.DataProvider;

public class NewCheckingData {
        @DataProvider(name = "new checking")
        public static Object[][] getNewCheckingData() {
            return new Object[][]{
                    {"AndyBadin@gmail.com", "1234ASdf", "Andy"},
            };
        }
    }

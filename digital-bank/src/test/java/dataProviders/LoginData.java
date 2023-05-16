package dataProviders;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "login")
    public static Object[][] getLoginData() {
        return new Object[][]{
                {"AndyBadin@gmail.com", "1234ASdf"},
        };
    }
}

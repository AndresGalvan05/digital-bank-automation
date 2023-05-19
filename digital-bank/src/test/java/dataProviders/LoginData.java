package dataProviders;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "login")
    public static Object[][] getLoginData() {
        return new Object[][]{
                {"AndyBadin@gmail.com", "1234ASdf", "Andy"},
                {"8il.andre@gmail.com", "Pass1234", "Andrés"},
        };
    }
}
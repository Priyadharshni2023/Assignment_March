package Tests;

import Base.TestBase;
import Pages.LoginPage;
import org.testng.annotations.Test;
import static Base.TestBase.initialization;
import static Base.TestBase.prop;

public class TestSuite  {

    public TestSuite() {
        super();
    }

    @Test
    public void loginTest () throws InterruptedException {
       initialization();
        LoginPage loginpageObject = new LoginPage();
        loginpageObject.login(prop.getProperty("username"),prop.getProperty("password"));
    }

}

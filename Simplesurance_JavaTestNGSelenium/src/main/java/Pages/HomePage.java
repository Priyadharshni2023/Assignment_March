package Pages;

import Base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends TestBase {
    WebDriverWait wait;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}

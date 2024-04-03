package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Util.CustomActions.waitAndClick;

public class LoginPage extends TestBase {


    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(@class,'MuiIconButton')]")
    WebElement languageButton;

    @FindBy(xpath = "/span[text()='Englisch']")
    WebElement englishLanguage;

    @FindBy(xpath = "//input[@id='login_username']")
    WebElement userNameInput;

    @FindBy(xpath = "/input[@id='login_password']")
    WebElement passwordInput;

    @FindBy(xpath = "/button[@type='submit']")
    WebElement loginBtn;

    public void login(String un, String pwd) throws InterruptedException {

        Thread.sleep(2000);
        //waitAndClick(languageButton,10);
        //waitAndClick(englishLanguage,10);
       languageButton.click();
        englishLanguage.click();
        userNameInput.sendKeys(un);
        passwordInput.sendKeys(pwd);
        loginBtn.click();
    }
}

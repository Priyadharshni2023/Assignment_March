package Base;

import Util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase{

    public static WebDriver driver;
    //public static Properties prop = new Properties();


    public TestBase(){
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("/Users/freshworks/Desktop/Java" +
                    "/Assignment_March/Simplesurance_JavaTestNGSelenium/src/main/java/Config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() throws InterruptedException{
        String browserName = "chrome";

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/freshworks/Desktop/Java/Assignment_March" +
                    "/Simplesurance_JavaTestNGSelenium/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "/Users/freshworks/Desktop/Java/Assignment_March/Simplesurance" +
                    "_JavaTestNGSelenium/src/main/resources/chromedriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}

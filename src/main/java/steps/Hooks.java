package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.browser_manager.WebDriverFactory;

public class Hooks {
    private static WebDriver driver;
    String browser = "chrome";
    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(browser);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Cierre correcto de browser");
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
